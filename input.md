# Function 
## Payment
### Payment: Create payments or get details of one or more payments.
####Create a payment
```json
{
  "intent":"sale",
  "payer":{
    "payment_method":"credit_card",
    "funding_instruments":[
      {
        "credit_card":{
          "number":"4417119669820331",
          "type":"visa",
          "expire_month":11,
          "expire_year":2018,
          "cvv2":"874",
          "first_name":"Betsy",
          "last_name":"Buyer",
          "billing_address":{
            "line1":"111 First Street",
            "city":"Saratoga",
            "state":"CA",
            "postal_code":"95070",
            "country_code":"US"
          }
        }
      }
    ]
  },
  "transactions":[
    {
      "amount":{
        "total":"7.47",
        "currency":"USD",
        "details":{
          "subtotal":"7.41",
          "tax":"0.03",
          "shipping":"0.03"
        }
      },
      "description":"This is the payment transaction description."
    }
  ]
}
```
####Execute an approved PayPal payment
####Look up a payment resource
####Update a payment resource
####List payment resources
### Sale Transactions: Get and refund completed payments (sale transactions).
####Look up a sale
####Refund a sale
###Refunds: Get details of a refund.
#### Look up a refund
###Authorizations: Capture, reauthorize, void, and look up authorizations.
####Look up an authorization
####Capture an authorization
####Void an authorization
####Reauthorize a payment
###Captures: Look up and refund captured payments.
####Look up a captured payment
####Refund a captured payment
###Billing Plans and Agreements: Set up recurring payments.
####Create a plan
####Update a plan
####Retrieve a plan
####List plans
####Create an agreement
####Execute an agreement
####Update an agreement
####Retrieve an agreement
####Suspend an agreement
####Reactivate an agreement
####Cancel an agreement
####Search for transactions
####Set outstanding agreement amounts
####Bill outstanding agreement amounts
###Orders: Create and manage orders.
####Retrieve an order
####Authorize an order
####Capture an order
####Void an order
####Refund an order
###Payouts: Send and manage payments to multiple recipients.
####Create a batch or single payout
####Get the status of a batch payout
####Get the status of a payout item
####Cancel an unclaimed payout item
##Vault: Store customer credit cards securely.
####Store a credit card
####Delete a stored credit card
####Look up a stored credit card
####List credit card resources
####Update a stored credit card
##Identity: Provide quick and secure login solutions for your website.
####Grant token from authorization code
####Grant token from refresh token
####Get user information
## Invoicing: Create and work with invoices.
####Create an invoice
####Send an invoice
####Update an invoice
####Retrieve an invoice
####Get invoices of a merchant
####Search for invoices
####Send an invoice reminder
####Cancel an invoice
####Delete an invoice
####Retrieve a QR code
####Record a payment
####Record a refund
## Payment Experience: Create and work with web experience profiles.
####Create a web experience profile
####Retrieve a web experience profile
####List web experience profiles
####Update a web experience profile
####Partially update a web experience profile
####Delete a web experience profile
## Notifications: Create and manage webhook notification events.
####Get a reference list of webhook event types
####Create a webhook
####Get a webhook
####List subscribed webhook event types
####List all webhooks
####Update a webhook
####Delete a webhook
####Retrieve a webhook event
####Search webhook events
####Resend a webhook event
####Simulate a webhook event
## Common Objects: Common objects shared among calls.
####Payments objects
####Billing Plans objects
####Billing Agreements objects
####Payout objects
####Identity objects
####Invoicing objects
####Payment Experience objects
####Notifications objects
##Errors: Errors this API returns.
####Payments Errors
####Billing Plans Errors
####Billing Agreements Errors
####Payouts Errors
####Vault Errors
####Invoicing Errors
#https://api.sandbox.paypal.com/v1/oauth2/token?client_id=<client_id>&secret=<secret>&grant_type=client_credentials
#https://api.sandbox.paypal.com/v1/identity/openidconnect/tokenservice?code={code}&client_id=<client_id>&secret=<Secret>&redirect_uri=<red>&grant_type=authorization_code
#https://api.sandbox.paypal.com/v1/identity/openidconnect/tokenservice?refresh_token=<Refresh-Token>&client_id=<client_id>&secret=<Secret>&grant_type=refresh_token