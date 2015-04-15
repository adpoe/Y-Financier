# Y-Financier
Java class used for downloading the most recent Yahoo Finance data for a given stock.

Just specify the stock and the output file, and this program will grab the most recent CSV, then save it to the specified location.


## To use this class

**Perform the following steps:**
  - Create an instance of YFinancier
      *   You may pass it two strings:
           1.  The stock symbol
           2.  File name or path for where the data should be stored
  - Call the #downloadFile method from your instance
  - The most recent full day's data on Yahoo Finance for the specified stock
    will be downloaded to the specified file location.
 
*Note:  If no parameters are explicitly set, the method will download data
on the S&P 500 Index Fund (SPY). The data will be stored within the directory
from which the program has been executed. The default filename is "finance.csv".*
  
Currently, all information is simply downloaded as a CSV, in the same form that Yahoo Finance outputs. 

If there is a desire for functions to manipulate this data and put it in a standard format, I may upload additional classes.

