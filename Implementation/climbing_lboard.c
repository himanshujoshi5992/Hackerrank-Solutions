#include <stdio.h>
#include <stdlib.h>

int main() {

	int number,n,m,count = 0;
	struct l_board {
		int score;
		struct l_board *next;
	};

	struct l_board *head = NULL;
	struct l_board *current;

	scanf("%d", &n);

	while(n) {
		scanf("%d", &number);
		struct l_board *temp = (struct l_board*) malloc(sizeof(struct l_board));
		temp->score = number;
		temp->next = NULL;
		if(!head) {

			head = temp;
			current = head;
		}
		else {
			if(temp->score == current->score) {
				n--;
				continue;
			}
				
			current->next = temp;
			current = temp;
		}
		n--;
	}



	scanf("%d", &m);
	while(m) {
		struct l_board *cur;
		scanf("%d", &number);
		/*
		struct l_board *temp = (struct l_board*) malloc(sizeof(struct l_board));
		temp->score = number;
		temp->next = NULL;
		*/
		cur = head;
		while(cur) {
			count++;
			if(cur->score <= number) {
				printf("%d\n", count);
				/*
				temp->next = cur->next;
				cur->next = temp;
				current = temp;
				*/
				count = 0;
				break;
			}
			else if(cur->score > number) {
				if(cur->next == NULL) {
					/*
					cur->next = temp;
					current = temp;
					*/
					printf("%d\n", count+1);
					count = 0;
					break;
				}
			
			}
			cur = cur->next;
		}
		m--;
	}
	return 0;

}