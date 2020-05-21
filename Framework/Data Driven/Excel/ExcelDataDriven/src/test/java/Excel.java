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

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("src\\test\\java\\data.xlsx");
		
		FileInputStream filepath = new FileInputStream(file.getAbsolutePath());
		XSSFWorkbook workbook = new XSSFWorkbook(filepath);		
		ArrayList<String> al = new ArrayList<String>();
		
		int sheets = workbook.getNumberOfSheets();
		for (int i=0; i<sheets; i++) 
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
			{
				XSSFSheet sheet1 = workbook.getSheetAt(i);
				
				Iterator<Row> rows=sheet1.iterator();
				Row firstrow = rows.next();
				
				
				Iterator<Cell> cells = firstrow.cellIterator();
				
				int j=0;
				int columnno =0;
				while(cells.hasNext())
				{
					Cell cellvalue = cells.next();
					
					if(cellvalue.getStringCellValue().equals("Tester Name"))
					{
						columnno=j;
					}
					j++;
				}
				System.out.println(columnno);
				
				while(rows.hasNext())
				{
					Row selectedcolumnrow= rows.next();
					
					if(selectedcolumnrow.getCell(columnno).getStringCellValue().equalsIgnoreCase("pqr"))
					{
						Iterator<Cell> selectedrowcell = selectedcolumnrow.cellIterator();
						while(selectedrowcell.hasNext())
						{
							Cell cell = selectedrowcell.next();
							if(cell.getCellTypeEnum()==CellType.STRING)
							{
								al.add(cell.getStringCellValue());
							}
							else 
							{
								al.add(NumberToTextConverter.toText(cell.getNumericCellValue()));
							}
						}
						System.out.println(al);
						
					}
					
				}
				
			}
		}
		
	}

}
