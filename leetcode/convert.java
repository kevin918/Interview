import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.text.ParsePosition;

import static org.testng.Assert.assertEquals;

public class convert {
    public static void main (String[] str) {
        String s = "1 7 ";
        System.out.println(s.trim());
    }

    static long convert (String ipAddress) throws Exception {
        if (ipAddress == null || ipAddress == "") {
            throw new Exception("ip address is null/empty");
        }
        String[] ipAddressInArray = ipAddress.split("\\.");

        long result = 0;
        for (int i = 0; i < ipAddressInArray.length; i++) {
            int power = 3 - i;
            String s = ipAddressInArray[i].trim();
            int len = s.length();

            if (len > 1) {
                for (int j = 0; j < len; j++) {
                    if(!Character.isDigit(s.charAt(j))) {
                        throw new Exception("contains non digits");
                    }
                }
            }

            int ip = Integer.parseInt(ipAddressInArray[i].trim());
            result += ip * Math.pow(256, power);
        }

        return result;
    }

    @Test
    public static void testNormal () throws Exception {
        String s = "172.168.5.1";
        long res = convert(s);
        assertEquals(res, 2896692481L);
    }

    @Test
    public static void testSpacesAroundDot () throws Exception {
        String s = "172 . 168.5.1";
        long res = convert(s);
        assertEquals(res, 2896692481L);
    }

    @Test (expectedExceptions = Exception.class)
    public static void testSpacesBetweenDigits () throws Exception {
        String s = "17 2.168.5.1";
        long res = convert(s);
    }

    @Test(expectedExceptions = Exception.class)
    public static void testNull () throws Exception {
        String s = null;
        long res = convert(s);
    }

    @Test(expectedExceptions = Exception.class)
    public static void testEmpty () throws Exception {
        String s = "";
        long res = convert(s);
    }

    @Test(expectedExceptions = Exception.class)
    public static void testNonLatin () throws Exception {
        String s = "17a.168.5.c";
        long res = convert(s);
    }
}