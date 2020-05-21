import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("src\\test\\java\\data1.xlsx");
		
		FileInputStream fis = new FileInputStream(file.getAbsolutePath());
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		ArrayList<String> al = new ArrayList<String>();
		
		int sheets = workbook.getNumberOfSheets();
		for (int i=0; i<sheets; i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
			{
				XSSFSheet sheet1 = workbook.getSheetAt(i);
				
				Iterator<Row> rows=sheet1.iterator();
				Row firstrow = rows.next();
			
				while(rows.hasNext())
				{
					Row selectedrow =rows.next();
					
					if(selectedrow.getCell(0).getStringCellValue().equalsIgnoreCase("Tester Name"))
					{
						Iterator<Cell> cells=selectedrow.cellIterator();
						
						int j=0;
						int columnno =0;
						while(cells.hasNext())
						{
							Cell cellvalue = cells.next();
							
							if(cellvalue.getStringCellValue().equals("pqr"))
							{
								columnno=j;
								
								while(rows.hasNext())
								{
									
									Row pqr = rows.next();
									
									if(pqr.getCell(columnno).getCellTypeEnum()==CellType.STRING)
									{
										al.add(pqr.getCell(columnno).getStringCellValue());
									}
									else 
									{
										al.add(NumberToTextConverter.toText(pqr.getCell(columnno).getNumericCellValue()));
									}
									
										
								}
								
							}
							j++;
						}
						System.out.println(columnno);
						System.out.println(al);
						
					}
					
				}
				
			}
			
		}
		
	}

}
