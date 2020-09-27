import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import classes.*;

public class Main {
    public static void main(String [] arg) throws Exception{
        System.out.println(0);
        Scanner in = new Scanner(new File(("_files/in.txt")));

        List<String> tables = new ArrayList<String>(){
            {
                add("t1"); add("t2"); add("t3"); add("t4"); add("t5");
                add("t6"); add("t7"); add("t8"); add("t9"); add("t10");
                add("t11");
            }
        };
        for (String table: tables){
            SelectCount_extnd sc = new SelectCount_extnd(table, "conn1");
            //SelectCount_Intrfc sc = new SelectCount_Intrfc(table);
            sc.start();
        }
    }
}


