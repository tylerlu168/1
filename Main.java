/**
 * CSE1322L Lab 1
 *
 * Tyler Lu
 *
 * A 4 by 13 char array that was provided which makes a picture of a car. Following the rules of the assignment I was
 * able to use methods, if/else statements, and for loops to rearrange the elements of the 2D array to make a mirrored
 * car image. Finally utilizing the method provided for the forward car and the mirrored car method I wrote, I printed
 * out the two cars facing each other.
 */
public class Main
{
    public static char[][] make_forward() //arranges the forward car picture into a 2d array
    {
        char[][] pixel = new char[4][13];
        pixel[0][0]=' '; pixel[0][1]=' '; pixel[0][2]='_'; pixel[0][3]='_'; pixel[0][4]='_'; pixel[0][5]='_'; pixel[0][6]='_'; pixel[0][7]='_'; pixel[0][8]=' '; pixel[0][9]=' '; pixel[0][10]=' '; pixel[0][11]=' '; pixel[0][12]=' '; pixel[1][0]=' '; pixel[1][1]='/'; pixel[1][2]='|'; pixel[1][3]='_'; pixel[1][4]='|'; pixel[1][5]='|'; pixel[1][6]='_'; pixel[1][7]='\\'; pixel[1][8]='\''; pixel[1][9]='.'; pixel[1][10]='_'; pixel[1][11]='_'; pixel[1][12]=' '; pixel[2][0]='('; pixel[2][1]=' '; pixel[2][2]=' '; pixel[2][3]=' '; pixel[2][4]='_'; pixel[2][5]=' '; pixel[2][6]=' '; pixel[2][7]=' '; pixel[2][8]=' '; pixel[2][9]='_'; pixel[2][10]=' '; pixel[2][11]='_'; pixel[2][12]='\\'; pixel[3][0]='='; pixel[3][1]='\''; pixel[3][2]='-'; pixel[3][3]='('; pixel[3][4]='_'; pixel[3][5]=')'; pixel[3][6]='-'; pixel[3][7]='-'; pixel[3][8]='('; pixel[3][9]='_'; pixel[3][10]=')'; pixel[3][11]='-'; pixel[3][12]='\'';
        return pixel;
    }
    public static char[][] make_mirror(char[][] array)//arranges the mirrored car picture into a 2d array
    {
        char[][] mirrored = new char[4][13];

        int counter = 12;
        for (int i = 0; i < 4; i++)
        {
            counter = 12;
            for (int j = 0; j < 13; j++)
            {
                if(array[i][j] == '(')//each statement checks to see if the element is a (, ), /, \. then reverses the char
                {
                    mirrored[i][counter] = ')';
                }
                else if(array[i][j] == ')')
                {
                    mirrored[i][counter] = '(';
                }
                else if(array[i][j] == '/')
                {
                    mirrored[i][counter] = '\\';
                }
                else if(array[i][j] == '\\')
                {
                    mirrored[i][counter] = '/';
                }
                else
                {
                    mirrored[i][counter] = array[i][j];
                }
                counter--; //counter variable allows... for example the element of mirrored[0][0] will be array[0][12] so on and so forth with "12" being the counter variable that is being subtracted after each iteration of the for loop
            }

        }

        return mirrored;
    }

    public static void main(String[] args) //main method
    {
        char[][] forwardCar = make_forward(); //sets the char array created in the make_forward method to a new/local char array
        for (int i = 0; i < 4; i++) //loop that prints out the forward car
        {
            for (int j = 0; j < 13; j++) //nested loops
            {
                System.out.print(forwardCar[i][j]);
            }
            System.out.println();//goes to the next line after printing each row
        }


        char[][] reversedCar = make_mirror(forwardCar);//loop that prints out a mirrored car
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 13; j++)
            {
                System.out.print(reversedCar[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) //nested loops
        {
            for (int j = 0; j < 13; j++)
            {
                System.out.print(forwardCar[i][j]);//will print out a row of the forward car
            }
            for (int k = 0; k < 13; k++)
            {
                System.out.print(reversedCar[i][k]);//will print out a row from the mirrored car
            }
            System.out.println();
        }

    }
}