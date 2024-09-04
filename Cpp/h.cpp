#include <stdio.h>
int max(int a,int b)
{
 return(a>b?a:b);
}
int main()
{
 int a[10],b,c,d;
 printf("请输入10个数字/n");
 for(b=0;b<10;b++)
  scanf("%d",&a[b]);
 c=a[0];
 for(b=1;b<10;b++)
  c=max(c,a[b]);
 printf("最大的数字是%d/n",c);
}
