package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long res(Long number1, Long number2) {
        logger.info("Subtracting {} - {}", number1, number2);
        return number1 - number2;
    }

    public Long mul(Long number1, Long number2) {
        logger.info("Multiplying {} * {}", number1, number2);
        return number1 * number2;
    }

    public Long div(Long number1, Long number2) {
        if(checkTwoExpression(numberNoZero(number1), numberNoZero(number2))){
            logger.info("Dividing {} / {}", number1, number2);
            return number1 / number2;
        }
        return 0L;
    }

    private boolean numberNoZero(Long number) {
        return number != 0;
    }

    private boolean checkTwoExpression(boolean One, boolean Two) {
        return One && Two;
    }

}
