package ASI_UDAF;

import org.apache.flink.table.functions.AggregateFunction;

import java.util.Iterator;

public class ASI_UDAF {
	public static class AccSum {
		public long sum;
	}

	public static class MySum extends AggregateFunction<Long, AccSum> {

		@Override
		public Long getValue(AccSum acSum) {
			return acSum.sum;
		}

		@Override
		public AccSum createAccumulator() {
			AccSum acCount = new AccSum();
			acCount.sum = 0;
			return acCount;
		}

		public void accumulate(AccSum acc, long num) {
			acc.sum += num;
		}

        /**
         * Support retract a msg generated by upstream operator.
         */
        public void retract(AccSum acc, long num) {
            acc.sum -= num;
        }

        /**
         * Support local-global two stage aggregate optimization.
         */
        public void merge(AccSum acc, Iterable<AccSum> it) {
            Iterator<AccSum> iter = it.iterator();
            while (iter.hasNext()) {
                AccSum accSum = iter.next();
                if (null != accSum) {
                    acc.sum += accSum.sum;
                }
            }
        }
	}
}
