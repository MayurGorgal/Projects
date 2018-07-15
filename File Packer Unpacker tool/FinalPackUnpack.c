#include<stdio.h>
#include<string.h>
#include<fcntl.h>
#include<dirent.h>
#include<stdlib.h>
#include<sys/stat.h>
#include<sys/types.h>


typedef int BOOL;
#define TRUE 1
#define FALSE 0

struct Info
{
 char name[20];
 int size;
};


//this function is used to merge merge all regular files from one directory into one file
BOOL pack(char *Dname,char *Fname)
{
     DIR *dirp=NULL;
     struct dirent *dp=NULL;
     struct Info obj1;
     struct stat sb;
     char Filename[200]={'\0'};
     char *buffer=NULL;  
     int fd=0;

     //open the file in Write mode
     fd=open(Fname,O_WRONLY);
     if(fd==-1)
     {
       printf("Error:Unable to open that file\n");
       return FALSE;
     }

   //opening the directory that we are given
    dirp=opendir(Dname);
    if(dirp==NULL)
    {
     printf("Error:Unable to open that directory");
     return FALSE;
    }

     //reads all the file in that directory
    //return null when there is no file in the directory           
    while(dp=readdir(dirp))
    {
          if(dp==NULL)
          {
            break;
          }
          else
          {
	    //creating the absolute path
 	    sprintf(Filename,"%s/%s",Dname,dp->d_name);
 
            //stat System call to check the type of file
            stat(Filename,&sb);

	    if(S_ISREG(sb.st_mode))
	    {
	      //coping the name of regular file into member of structure name
	      strcpy(obj1.name,dp->d_name);
	      //copying size of file into the member of structure size
	      obj1.size=sb.st_size;
   	      //write the whole structure into the file
 	      int iRet=write(fd,&obj1,sizeof(obj1));

	      //opening one by one regular file present in the Directory
	      int fd1=open(Filename,O_RDONLY);
	       
		if(fd1==-1)
	        {
	           printf("Error:Unable to open that file\n");
	           return FALSE;
	        }
	        else
	        {
	           //create an array of size equal to the filesize
	           buffer=(char*)malloc((obj1.size)*sizeof(char)); 
		   if(buffer==NULL)
	           {
		     printf("Error:Unable to allocate Memory\n");
	             return FALSE;
	           }

 		  //this function is used to read whole data from regular file
	          iRet=read(fd1,buffer,obj1.size);//fd1=filename buffer=memory_allocated_array obj1.size=>size_of_Whole_file
	 	  if(iRet==-1)
	          {
	           printf("Error:Unable to read that file\n");
	  	   return FALSE;
	          }
	          else
		  {
		    //this function is used to write the data of regular file into one text file
		    iRet=write(fd,buffer,obj1.size);//now we are writing into the combined.txt file
	 	    if(iRet==-1)
	            {
	             printf("Error:Unable to write into Conbined.txt");
	             return FALSE;
	            }
		  }
	 	 //deallocating the memory of buffer
		 free(buffer);
	      }
	     //closing the opened regular file
	     close(fd1);
	  } 
      }
   
 }

 close(fd);//closing the opened file i.e Combine.txt 
return TRUE;    
}//end of pack



BOOL unpack(char *Fname,char *Dname)
{
  struct Info obj1;
  char *buffer=NULL;
  int iRet=0;
  int iRet1=0;
  char Filename[200];

  //creating the new directory
  iRet=mkdir(Dname,0777);
  if(iRet==-1)
  {
    printf("Error:Unable to create the directory\n");
    return FALSE;
  }
 
  //opening the file Combine.txt
  int fd=open(Fname,O_RDONLY);
  if(fd==-1)
  {
   printf("Error:Unable to open that file\n");
   return FALSE;
  }

     //read until the end of file
     while((read(fd,&obj1,sizeof(obj1)))!=0)
     {  
     	//creating the absolute path
     	sprintf(Filename,"%s/%s",Dname,obj1.name);
    
     	//creating the new file in the directory
     	int fd1=creat(Filename,0777);
    	if(fd==-1)
     	{
      	  printf("Error:Unable to create file\n");
      	  return FALSE;
     	}
     	//creating the buffer to read the data of one whole file from Combine.txt
	buffer=(char*)malloc((obj1.size)*sizeof(char));

     	if(buffer==NULL)
     	{
      	  printf("Error:Unable to allocate the memory\n");
      	  return FALSE;
     	}
     
     	//to read the data from combine.txt
     	iRet=read(fd,buffer,obj1.size);
        
   	if(iRet1==-1)
     	{
      	 printf("Error:Unable to read data from Combine.txt\n");
      	 return FALSE;
     	}
          	
	//to write the data into new file 
     	iRet1=write(fd1,buffer,obj1.size);
     	
     	if(iRet1==-1)
     	{
       	  printf("error:unable to write into the file\n");
       	  return FALSE;
     	}
      	free(buffer);
	close(fd1);
  }
close(fd);
return TRUE;
}//end of unpack



//entry point function
int main(int argc,char *argv[])
{

   char ch;
   if(argc!=4)
   {
    printf("Error:Invalid input\n");
    return -1;
   }

   if(strcmp(argv[1],"-p")==0)
   {
      
     BOOL BRet=pack(argv[2],argv[3]);     
     if(BRet==1)
     {    
      printf("Files gets sucessfully packed\n");
     }
     else
     {
       printf("Error:Unable to perform pack operation\n");
     }
   }
   else if(strcmp(argv[1],"-u")==0)
   {
     BOOL BRet=unpack(argv[2],argv[3]);
     if(BRet==1)
     {    
      printf("File gets sucessfully unpacked into given Directory\n");
     }
     else
     {
       printf("Error:Unable to perform unpack operation\n");
     } 
    }
   else
   {
      printf("Error:invalid input\n");
      return -1;
   }
}
