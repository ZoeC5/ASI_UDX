package ASI_UDF;

import org.apache.flink.table.functions.ScalarFunction;

public class Varchar2String extends ScalarFunction {

    public String eval(String s) {
        return s;
    }
}
