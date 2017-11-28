Set objExcel = CreateObject("Excel.Application")
Set objWorkbook = objExcel.Workbooks.Open("E:\Test\Book.xlsm")

objExcel.Application.Run "maketable" 

objWorkbook.SaveAs "E:\Test\shaba.xls"
objExcel.ActiveWorkbook.Close

objExcel.Application.Quit
WScript.Quit