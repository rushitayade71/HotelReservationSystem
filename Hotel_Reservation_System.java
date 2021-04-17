
public class Hotel_Reservation_System {

		private String hotelName;
		private float rating;
		private int regularWeekDay;
		private int regularWeekEnd;
		private int rewardWeekDay;
		private int rewardWeekEnd;
	

	public Hotel_Reservation_System(String hotelName, float rating) {
		}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	
	public float getRating() {
		return rating;
	}

	public int getRegularWeekDay() {
		return regularWeekDay;
	}

	public void setRegularWeekDay(int regularWeekDay) {
		this.regularWeekDay = regularWeekDay;
	}

	public int getRegularWeekEnd() {
		return regularWeekEnd;
	}

	public void setRegularWeekEnd(int regularWeekEnd) {
		this.regularWeekEnd = regularWeekEnd;
	}

	public int getRewardWeekDay() {
		return rewardWeekDay;
	}

	public void setRewardWeekDay(int rewardWeekDay) {
		this.rewardWeekDay = rewardWeekDay;
	}

	public int getRewardWeekEnd() {
		return rewardWeekEnd;
	}

	public void setRewardWeekEnd(int rewardWeekEnd) {
		this.rewardWeekEnd = rewardWeekEnd;
	}



	
}
