package foo;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

/**
 * The Interface SuchInterface.
 */
public interface SuchInterface {

    /**
     * Gets the unit associated with this class.
     */
    Unit<? extends Quantity> getUnit();

}
