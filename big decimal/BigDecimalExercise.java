import java.math.BigDecimal;

public class BigDecimalExercise{

	public static void main(String args[])
    {
        /*
        // Big decimal warns about non ending numbers

        Double i = 100.0;
        Double n = 3.0;

        Double answer = i / n;

        System.out.println(answer);

        Double iValue = answer * n;
        System.out.println( iValue);

        System.out.println("-------------------- Big Decimal -------------------");

        
        BigDecimal ans = (new BigDecimal(Double.toString(i))).divide(new BigDecimal(n));

        System.out.println(ans.toString());
		*/

        double a=0.03;
        double b=0.04;
        double c=b-a;
        System.out.println(a);
        System.out.println(c);
        System.out.println( c + a);

        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a);
        System.out.println(_c);

        //////////////////////////////
        Double m;
        Double totMarks = 0.0;
        Double avMarks = 0.0;
        
        for(int i = 0; i < noOfStudents; i++)
        {
			m = marksArray[i];
            totMarks = totMarks + m;

		}

        avMarks = totMarks / noOfStudents;
        System.out.println(avMarks);

    }
		

}