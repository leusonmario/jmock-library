package test.jmock.constraint;

import org.jmock.constraint.Or;


public class OrTest extends ConstraintsTest {
    public void testEvaluatesToTheTheLogicalDisjunctionOfTwoOtherConstraint() {
        assertTrue( new Or(TRUE_CONSTRAINT,  TRUE_CONSTRAINT) .eval(ARGUMENT_IGNORED));
        assertTrue( new Or(FALSE_CONSTRAINT, TRUE_CONSTRAINT) .eval(ARGUMENT_IGNORED));
        assertTrue( new Or(TRUE_CONSTRAINT,  FALSE_CONSTRAINT).eval(ARGUMENT_IGNORED));
        assertFalse(new Or(FALSE_CONSTRAINT, FALSE_CONSTRAINT).eval(ARGUMENT_IGNORED));
    }
    
    
    public void testEvaluatesArgumentsLeftToRightAndShortCircuitsEvaluation() {
        assertTrue( new Or(TRUE_CONSTRAINT,NEVER_EVALUATED).eval(ARGUMENT_IGNORED) );
    }
}
