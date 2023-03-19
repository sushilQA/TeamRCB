package org.testing.RCB.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testing.RCB.Resources.Players;
import org.testing.RCB.Resources.RCB;
import org.testing.RCB.utilities.ApiValidation;

import com.fasterxml.jackson.databind.ObjectMapper;
import jxl.read.biff.BiffException;

public class ValidateWicketKeeper {

	ApiValidation apiValidation = new ApiValidation();

	public void validateWicketKeeper(File file) throws IOException, BiffException {
		System.out.println("******************** Validate Wicket Keeper ********************\n");
		try {
			ObjectMapper mapper = new ObjectMapper();
			// Loading given json file into poojo
			RCB rcb = mapper.readValue(file, RCB.class);
			int wicketKeeper = 0;
			if (rcb.getPlayer().size() == 11) {
				for (Players p : rcb.getPlayer()) {
					if (p.getRole().equalsIgnoreCase("Wicket-keeper")) {
						wicketKeeper++;
					}
				}
				if (wicketKeeper == 1) {
					System.out.println("Submitted team is qualified for selection as the same have 1 wicket keeper");
				} else
					System.out.println("Submitted team is not qualified for selection as the same have " + wicketKeeper
							+ " wicket keeper");
			} else
				System.out.println("Team size is not as per IPL standerd");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}