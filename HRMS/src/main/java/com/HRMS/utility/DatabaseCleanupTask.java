package com.HRMS.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabaseCleanupTask {

	static Logger logger = LoggerFactory.getLogger(DatabaseCleanupTask.class);

	public static void DatabaseCleanup() {
		// Initialize a new Timer
		Timer timer = new Timer();

		// Schedule the task to run every 5 minutes
		timer.schedule(new CleanupTask(), 0, 5 * 60 * 1000);
	}

	public static void main(String args[]) {

	}

	public static class CleanupTask extends TimerTask {

		@Override
		public void run() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/HRMS", "root", "root");
				String query = "delete from tbl_otp WHERE ts <= NOW() - INTERVAL 5 minute;";
				Statement stmt = conn.createStatement();
				int rowsDeleted = stmt.executeUpdate(query);

				logger.info(rowsDeleted + " rows deleted from the database.");

//				stmt.close();
//				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
