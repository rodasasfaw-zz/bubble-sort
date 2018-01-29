package com.example.bubblesort.bubblesort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
    @RequestMapping("/")
    public String bubblesort() {
        String arraylist = "";

        int a[] = new int[5];
        int i;
        int j;
        int num;
        a[0] = 34;
        a[1] = 29;
        a[2] = 69;
        a[3] = 33;
        a[4] = 88;

        for (i = 0; i < 5; i++)

        {
            for (j = 0; j < 5 - i - 1; j++) {
                if (a[i] > a[i + 1]) {
                    num = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = num;
                }
            }
        }
            for (i = 0; i < 5; i++) {
                System.out.println(a[i]);
            }

            arraylist += Integer.toString(a[i]);
            return arraylist;
        }

    }











