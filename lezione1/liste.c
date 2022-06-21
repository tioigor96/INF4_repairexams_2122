#include <stdio.h>
#include <stdlib.h>

struct node_t {
    int n;
    struct node_t *next;
};

typedef struct node_t node;

node* enqueue_order(node* head, node* last) {
    if(head==NULL){
        return last;
    }
    if(head->n<last->n){
      head->next = enqueue(head->next,last);  
    } else {
        last->next=head;
        head=last;
    }
    return head;
}

node* enqueue(node* head, node* last) {
    if(head==NULL){
        return last;
    }
    
    head->next = enqueue(head->next,last);  
    
    return head;
}

node* dequeue(node* head) {
    if(head != NULL) {
        node* aux = head;
        head = head->next;
        free(aux);
    }
    return head;
}

void printqueue(node* head){
    for(node* aux=head; aux!=NULL; aux=aux->next){
        printf("[%d]->",aux->n);
    }
    printf("|||\n");
}

int main()
{
    
    node *head=NULL,*last=NULL;
    last=malloc(sizeof(node));
    last->n=24;
    last->next=NULL;
    head=enqueue(head,last);
    last=malloc(sizeof(node));
    last->n=23;
    last->next=NULL;
    head=enqueue(head,last);
    last=malloc(sizeof(node));
    last->n=26;
    last->next=NULL;
    head=enqueue(head,last);
    last=malloc(sizeof(node));
    last->n=25;
    last->next=NULL;
    head=enqueue(head,last);
    
    printqueue(head);
    

    //TODO: IMPLEMENTARE eliminazione in coda e inserimento in testa


    return 0;
}
