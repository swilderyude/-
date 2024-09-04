#include <stdio.h>
int main()
{
    int max(int x,int y);
   int a,b,c,d;
   scanf ("%d,%d,%d,%d",&a,&b,&c,&d);
   printf("%d",max(d,max(c,max(a,b))));
   return 0;
}
int max(int x,int y)
{
    return(x>y?x:y);
}
printf("输入方阵的阶数：");
    scanf("%d",&z);
