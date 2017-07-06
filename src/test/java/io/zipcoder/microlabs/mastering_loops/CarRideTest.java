package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;


public class CarRideTest {
	@Test
	// :Given
		public void areWeThereYet() {
			CarRide carride = new CarRide();
			String expected = "Good!";
		//:when	
			String actual = carride.areWeThereYet();
		//:Then
			Assert.assertEquals(expected, actual);
			
		}
	
}

    
    

