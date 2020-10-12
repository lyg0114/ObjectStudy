package ch2.condition;

import ch2.Screening;

public interface DiscountCondition {

    public boolean isSatisfiedBy(Screening screening);

}
