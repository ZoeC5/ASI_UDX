package ASI_UDF;

import org.apache.flink.table.functions.ScalarFunction;

// https://help.aliyun.com/zh/flink/developer-reference/udsfs?spm=a2c4g.11186623.0.i8
public class ASI_UDF extends ScalarFunction {

    /**
     * 对s做处理，返回加工后的值
     * @param s 待处理值
     * @param begin
     * @param end
     * @return 处理后的值
     */
    public String eval(String s, Integer begin, Integer end) {
        return s.substring(begin, end);
    }



}
