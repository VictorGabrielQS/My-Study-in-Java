package Packages.src.com.exemplo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String formatarData(Date data){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }
}
