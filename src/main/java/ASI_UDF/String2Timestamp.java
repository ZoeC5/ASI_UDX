package ASI_UDF;

import org.apache.flink.table.functions.ScalarFunction;

public class String2Timestamp extends ScalarFunction {

    public long eval(String datetimeValue) {
        // Parse the datetime string and convert it to a timestamp
        // You can customize the parsing logic based on your datetime format
        // For example, assuming the input format is 'yyyy-MM-dd HH:mm:ss'
        return java.sql.Timestamp.valueOf(datetimeValue).getTime();
    }
}
