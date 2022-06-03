package threads;

import java.text.SimpleDateFormat;

public class ThreadLocalUsage {
    public static ThreadLocal<SimpleDateFormat> df = ThreadLocal.withInitial(()->new SimpleDateFormat("yyyy-mm-dd"));
}
