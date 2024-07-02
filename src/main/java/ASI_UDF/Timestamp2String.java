package ASI_UDF;

import org.apache.flink.table.functions.ScalarFunction;

public class Timestamp2String extends ScalarFunction {

    public String eval(java.sql.Timestamp timestampValue) {
        // Convert the timestamp to a formatted string
        // You can customize the formatting based on your requirements
        return timestampValue.toString();
    }
}
