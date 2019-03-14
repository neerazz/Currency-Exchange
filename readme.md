This is a sample app with list of 2 micro-service:

|Project | Descriptions|
|---|---|
|**Calculate Service (`calculateexchange`)** | This project called the Exchange service for the current Rates. And then does the math to get the total value after converting. |
|**Exchange Service (`exchangeservice`)** | This project called the Exchange service for teh current Rates. And then does teh math to get the total value after converting. |


##End Points:

Project | Method | EndPoint | Description |
---|---|---|---|
**Calculate Service (`calculateexchange`)** |  **`GET`** |1. /api/calculate/from/{from}/to/{to}/{amount}. | This accepts the **FROM** and **TO** currency and the **AMOUNT** and returns the exchange rate along with the total converted rate.
**Calculate Service (`calculateexchange`)** |  **`GET`** |2. /api/calculate/v2/from/{from}/to/{to}/{amount}. | This does teh same as above, but the abive end point is an hardcoded endpoint. But this will do a client side load balancing and do the same actions.  
**Exchange Service (`exchangeservice`)**  |  **`GET`** | /api/exchange/from/{from}/to/{to} | This accepts the From and TO currency and gives teh current exchange rate.

##Open the individual service for more details.

###Few Sample URL's:

http://localhost:8761/

http://localhost:9000/api/calculate/v2/from/USD/to/INR/1000

http://localhost:8100/api/exchange/from/USD/to/INR

http://localhost:9100/calculate-exchange-service/api/calculate/v2/from/USD/to/INR/1000
