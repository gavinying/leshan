package org.eclipse.leshan.client.demo;

import java.util.Random;

import org.eclipse.leshan.client.resource.BaseInstanceEnabler;
import org.eclipse.leshan.core.response.ExecuteResponse;
import org.eclipse.leshan.core.response.ReadResponse;

public class Power_Measurement extends BaseInstanceEnabler {

    /**
     * Item ID: 5800 - The current active power
     */
    private float instantaneous_active_power = 0.0f;
    
    /**
     * Item ID: 5801 - The minimum active power measured by the sensor since it is ON
     */
    private float min_measured_active_power = 0.0f;
    
    /**
     * Item ID: 5802 - The maximum active power measured by the sensor since it is ON
     */
    private float max_measured_active_power = 0.0f;
    
    /**
     * Item ID: 5803 - The minimum active power that can be measured by the sensor
     */
    private float min_range_active_power = 0.0f;
    
    /**
     * Item ID: 5804 - The maximum active power that can be measured by the sensor
     */
    private float max_range_active_power = 0.0f;
    
    /**
     * Item ID: 5805 - The cumulative active power since the last cumulative energy reset or device start
     */
    private float cumulative_active_power = 0.0f;
    
    /**
     * Item ID: 5806 - Request an active power calibration by writing the value of a calibrated load.
     */
    private float active_power_calibration = 0.0f;
    
    /**
     * Item ID: 5810 - The current reactive power
     */
    private float instantaneous_reactive_power = 0.0f;
    
    /**
     * Item ID: 5811 - The minimum reactive power measured by the sensor since it is ON
     */
    private float min_measured_reactive_power = 0.0f;
    
    /**
     * Item ID: 5812 - The maximum reactive power measured by the sensor since it is ON
     */
    private float max_measured_reactive_power = 0.0f;
    
    /**
     * Item ID: 5813 - The minimum active power that can be measured by the sensor
     */
    private float min_range_reactive_power = 0.0f;
    
    /**
     * Item ID: 5814 - The maximum reactive power that can be measured by the sensor
     */
    private float max_range_reactive_power = 0.0f;
    
    /**
     * Item ID: 5815 - The cumulative reactive power since the last cumulative energy reset or device start
     */
    private float cumulative_reactive_power = 0.0f;
    
    /**
     * Item ID: 5816 - Request a reactive power calibration by writing the value of a calibrated load.
     */
    private float reactive_power_calibration = 0.0f;
    
    /**
     * Item ID: 5820 - If applicable, the power factor of the current consumption.
     */
    private float power_factor = 0.0f;
    
    /**
     * Item ID: 5821 - Read or Write the current calibration coefficient
     */
    private float current_calibration = 0.0f;
    
        
    /**
     * Getter for instantaneous_active_power.
     */
    public float getInstantaneous_active_power() {
    	return new Random().nextFloat();
        //return this.instantaneous_active_power;
    }
    
    /**
     * Getter for min_measured_active_power.
     */
    public float getMin_measured_active_power() {
        return this.min_measured_active_power;
    }
    
    /**
     * Getter for max_measured_active_power.
     */
    public float getMax_measured_active_power() {
        return this.max_measured_active_power;
    }
    
    /**
     * Getter for min_range_active_power.
     */
    public float getMin_range_active_power() {
        return this.min_range_active_power;
    }
    
    /**
     * Getter for max_range_active_power.
     */
    public float getMax_range_active_power() {
        return this.max_range_active_power;
    }
    
    /**
     * Getter for cumulative_active_power.
     */
    public float getCumulative_active_power() {
        return this.cumulative_active_power;
    }
    
    /**
     * Getter for active_power_calibration.
     */
    public float getActive_power_calibration() {
        return this.active_power_calibration;
    }
    
    /**
     * Getter for instantaneous_reactive_power.
     */
    public float getInstantaneous_reactive_power() {
        return this.instantaneous_reactive_power;
    }
    
    /**
     * Getter for min_measured_reactive_power.
     */
    public float getMin_measured_reactive_power() {
        return this.min_measured_reactive_power;
    }
    
    /**
     * Getter for max_measured_reactive_power.
     */
    public float getMax_measured_reactive_power() {
        return this.max_measured_reactive_power;
    }
    
    /**
     * Getter for min_range_reactive_power.
     */
    public float getMin_range_reactive_power() {
        return this.min_range_reactive_power;
    }
    
    /**
     * Getter for max_range_reactive_power.
     */
    public float getMax_range_reactive_power() {
        return this.max_range_reactive_power;
    }
    
    /**
     * Getter for cumulative_reactive_power.
     */
    public float getCumulative_reactive_power() {
        return this.cumulative_reactive_power;
    }
    
    /**
     * Getter for reactive_power_calibration.
     */
    public float getReactive_power_calibration() {
        return this.reactive_power_calibration;
    }
    
    /**
     * Getter for power_factor.
     */
    public float getPower_factor() {
        return this.power_factor;
    }
    
    /**
     * Getter for current_calibration.
     */
    public float getCurrent_calibration() {
        return this.current_calibration;
    }
    

    /**
     * Setter for instantaneous_active_power.
     */
    public void setInstantaneous_active_power(float instantaneous_active_power) {
        this.instantaneous_active_power = instantaneous_active_power;
    }
    
    /**
     * Setter for min_measured_active_power.
     */
    public void setMin_measured_active_power(float min_measured_active_power) {
        this.min_measured_active_power = min_measured_active_power;
    }
    
    /**
     * Setter for max_measured_active_power.
     */
    public void setMax_measured_active_power(float max_measured_active_power) {
        this.max_measured_active_power = max_measured_active_power;
    }
    
    /**
     * Setter for min_range_active_power.
     */
    public void setMin_range_active_power(float min_range_active_power) {
        this.min_range_active_power = min_range_active_power;
    }
    
    /**
     * Setter for max_range_active_power.
     */
    public void setMax_range_active_power(float max_range_active_power) {
        this.max_range_active_power = max_range_active_power;
    }
    
    /**
     * Setter for cumulative_active_power.
     */
    public void setCumulative_active_power(float cumulative_active_power) {
        this.cumulative_active_power = cumulative_active_power;
    }
    
    /**
     * Setter for active_power_calibration.
     */
    public void setActive_power_calibration(float active_power_calibration) {
        this.active_power_calibration = active_power_calibration;
    }
    
    /**
     * Setter for instantaneous_reactive_power.
     */
    public void setInstantaneous_reactive_power(float instantaneous_reactive_power) {
        this.instantaneous_reactive_power = instantaneous_reactive_power;
    }
    
    /**
     * Setter for min_measured_reactive_power.
     */
    public void setMin_measured_reactive_power(float min_measured_reactive_power) {
        this.min_measured_reactive_power = min_measured_reactive_power;
    }
    
    /**
     * Setter for max_measured_reactive_power.
     */
    public void setMax_measured_reactive_power(float max_measured_reactive_power) {
        this.max_measured_reactive_power = max_measured_reactive_power;
    }
    
    /**
     * Setter for min_range_reactive_power.
     */
    public void setMin_range_reactive_power(float min_range_reactive_power) {
        this.min_range_reactive_power = min_range_reactive_power;
    }
    
    /**
     * Setter for max_range_reactive_power.
     */
    public void setMax_range_reactive_power(float max_range_reactive_power) {
        this.max_range_reactive_power = max_range_reactive_power;
    }
    
    /**
     * Setter for cumulative_reactive_power.
     */
    public void setCumulative_reactive_power(float cumulative_reactive_power) {
        this.cumulative_reactive_power = cumulative_reactive_power;
    }
    
    /**
     * Setter for reactive_power_calibration.
     */
    public void setReactive_power_calibration(float reactive_power_calibration) {
        this.reactive_power_calibration = reactive_power_calibration;
    }
    
    /**
     * Setter for power_factor.
     */
    public void setPower_factor(float power_factor) {
        this.power_factor = power_factor;
    }
    
    /**
     * Setter for current_calibration.
     */
    public void setCurrent_calibration(float current_calibration) {
        this.current_calibration = current_calibration;
    }
    

    /**
     * Gets the current value of one of this LWM2M object instance's resources.
     */
    @Override
    public ReadResponse read(int resourceid) {
        switch (resourceid) {
        case 5800:
            return ReadResponse.success(resourceid, getInstantaneous_active_power());
        case 5801:
            return ReadResponse.success(resourceid, getMin_measured_active_power());
        case 5802:
            return ReadResponse.success(resourceid, getMax_measured_active_power());
        case 5803:
            return ReadResponse.success(resourceid, getMin_range_active_power());
        case 5804:
            return ReadResponse.success(resourceid, getMax_range_active_power());
        case 5805:
            return ReadResponse.success(resourceid, getCumulative_active_power());
        case 5806:
            return ReadResponse.success(resourceid, getActive_power_calibration());
        case 5810:
            return ReadResponse.success(resourceid, getInstantaneous_reactive_power());
        case 5811:
            return ReadResponse.success(resourceid, getMin_measured_reactive_power());
        case 5812:
            return ReadResponse.success(resourceid, getMax_measured_reactive_power());
        case 5813:
            return ReadResponse.success(resourceid, getMin_range_reactive_power());
        case 5814:
            return ReadResponse.success(resourceid, getMax_range_reactive_power());
        case 5815:
            return ReadResponse.success(resourceid, getCumulative_reactive_power());
        case 5816:
            return ReadResponse.success(resourceid, getReactive_power_calibration());
        case 5820:
            return ReadResponse.success(resourceid, getPower_factor());
        case 5821:
            return ReadResponse.success(resourceid, getCurrent_calibration());
        default:
            return super.read(resourceid);
        }
    }
    
    /**
     * Executes the operation represented by one of this LWM2M object instance's resources.
     */
    @Override
    public ExecuteResponse execute(int resourceid, String params) {
        switch (resourceid) {
        case 5822:
            // TODO: Implement execution code here
            // ...
            return ExecuteResponse.success();
        case 5605:
            // TODO: Implement execution code here
            // ...
            return ExecuteResponse.success();
        default:
            return ExecuteResponse.success();
        }

    }

}

