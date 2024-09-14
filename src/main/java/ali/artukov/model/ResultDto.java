package ali.artukov.model;

import java.util.Arrays;

public class ResultDto {
    private final int[] result;
    private final long stepCount;
    private final long usedTimeInNanoseconds;

    public ResultDto(int[] result, long stepCount, long usedTimeInNanoseconds) {
        this.result = result;
        this.stepCount = stepCount;
        this.usedTimeInNanoseconds = usedTimeInNanoseconds;
    }

    public int[] getResult() {
        return result;
    }

    public long getStepCount() {
        return stepCount;
    }

    public long getUsedTimeInNanoseconds() {
        return usedTimeInNanoseconds;
    }

    @Override
    public String toString() {
        return "ResultDto{" +
            "result=" + Arrays.toString(result) +
            ", stepCount=" + stepCount +
            ", usedTimeInNanoseconds=" + usedTimeInNanoseconds +
            '}';
    }
}
