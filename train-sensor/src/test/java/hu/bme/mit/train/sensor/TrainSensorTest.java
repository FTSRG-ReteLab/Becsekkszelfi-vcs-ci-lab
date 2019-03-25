package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

@Test
public void test1() {
	overrideSpeedLimit(-1);
	Assert.assertTrue(user.getAlarmState);
}

@Test
public void test2() {
	overrideSpeedLimit(510);
	Assert.assertTrue(user.getAlarmState);
}

@Test
public void test3() {
	overrideSpeedLimit(150);
	overrideSpeedLimit(50);
	Assert.assertTrue(user.getAlarmState);
}

@Test
public void test4() {
	overrideSpeedLimit(10);
	Assert.assertEquals(speedLimit, 10);
}
	
  
    
 
