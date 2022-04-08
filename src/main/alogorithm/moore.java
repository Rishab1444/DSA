package main.alogorithm;

public class moore {

                public void voore(int a[])
                {
                    int count = 0;
                    int index =-1;
                    for(int i = 0;i<6;i++) {
                        if (count == 0)
                        {    index = a[i];
                        count = 1;
                    }
                    else
                    {
                            if(a[i]==index)
                            {
                                count++;
                            }
                            else
                            {
                                count --;
                            }
                    }
                }
            }}
