package org.testing.RCB.TestCases;

import java.io.File;
import java.io.IOException;
import org.testing.RCB.Resources.Players;
import org.testing.RCB.Resources.RCB;
import com.fasterxml.jackson.databind.ObjectMapper;
import jxl.read.biff.BiffException;

public class ValidateForeignPlayers {

	public void validateForeignPlayers(File file) throws IOException, BiffException {
		System.out.println("******************** Validate Foreign Players ********************\n");
		try {
			ObjectMapper mapper = new ObjectMapper();
			// Loading given json file into poojo
			RCB rcb = mapper.readValue(file,
					RCB.class);
			int playersCount = 0;
			if (rcb.getPlayer().size() == 11) 
			{
				for (Players p : rcb.getPlayer()) 
				{
					if (!p.getCountry().equalsIgnoreCase("India")) 
					{
						playersCount++;
					}					
				}
				if(playersCount == 4)
				{
					System.out.println("Submitted team is qualified for selection as the same have only 4 foreign players");
				}
				else
					System.out.println("Submitted team is not qualified for selection as the same have "+playersCount+" foreign players");			
			}
			else
				System.out.println("Team size is not as per IPL standerd");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}