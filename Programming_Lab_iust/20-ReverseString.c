// to reverse a string 

#include <stdio.h>

int getSize(char*);
int main(){
	char str[100];
	printf("Enter string: ");
	gets(str);
	
	int lowerIndex = 0;
	int upperIndex = getSize(str) - 1;
	
	while(lowerIndex<=upperIndex){
		char temp = str[lowerIndex];
		str[lowerIndex] = str[upperIndex];
		str[upperIndex] = temp;
		
		lowerIndex++;
		upperIndex--;
	}
	
	printf("Reversed String: ");
	puts(str);
	return 0;
 }

int getSize(char* str){
	int i = 0;
	int count = 0;
	while(str[i] != '\0'){
		if(str[i] == ' '){
			i++;
			continue;
		}
		count++;
		i++;
	}
	
	return count;
}
