#include <stdio.h>
#include <conio.h>
void main()
{
    int no, i, j, k, l;
    printf("Enter a line of box: ");
    scanf("%d", &no);
    k = (1 + 2 * (no - 1));
    for (i = 0; i <= (k / 2); i++)
    {
        for (j = no; j >= no - i; j--)
        {
            printf("%d ", j);
        }
        l = (k - (2 * (i + 1)));
        for (j = 1; j <= l; j++)
        {
            printf("%d ", no - i);
        }
        for (j = no - i; j <= no; j++)
        {
            if (j == 1)
                continue;
            printf("%d ", j);
        }
        printf("\n");
    }
    for (i = 0; i < k / 2; i++)
    {
        for (j = no; j >= 2 + i; j--)
        {
            printf("%d ", j);
        }
        for (j = 1; j <= (2 * i) + 1; j++)
        {
            printf("%d ", (2 + i));
        }
        for (j = 2 + i; j <= no; j++)
        {
            printf("%d ", j);
        }
        printf("\n");
    }
    getch();
}
