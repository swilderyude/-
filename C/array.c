#include <stdio.h>
int main()
{
    int i, j, a, b, d;
    printf("请输入数组的行和列:");
    scanf("行=%d,列=%d", &a, &b);
    int c[a][b];
    for (i = 0; i < a; i++)
        for (j = 0; j < b; j++)
            c[i][j] = (i + 1) * (j + 1);

    for (d = 0; d < b; d++)
    {
        printf("%c", c[i][j]);
        if (d == b - 1)
            printf("\n");
    }
    return 0;
}