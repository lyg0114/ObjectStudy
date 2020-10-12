package ch2.policy;

import ch2.Money;
import ch2.Screening;
import ch2.condition.DiscountCondition;
import javafx.stage.Screen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {

    private List<DiscountCondition> conditions = new ArrayList<>(); //여러개의 할인조건


    public DiscountPolicy(DiscountCondition ... conditions){
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions){
            if(each.isSatisfiedBy(screening)){
                return getDisCountAmount(screening);
            }
        }

        return Money.ZERO;
    }
    abstract protected Money getDisCountAmount(Screening screening); //이메서드를 상속하는부분에서 정의할 수 있도록 한다.

}
