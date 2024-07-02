package ASI_UDF;

import org.apache.flink.table.functions.ScalarFunction;

public class Blob2String extends ScalarFunction {

    public String eval(byte[] blobValue) {
        return new String(blobValue); // Convert BLOB to STRING
    }
}
