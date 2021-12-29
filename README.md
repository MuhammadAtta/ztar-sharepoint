# ztar-shipping

Coding Assignment

The project assignment is to create a shipping microservice that hides the complexity of integrating with multiple shipment services, UPS, and FedEx. Your submission will be judged on translating the acceptance Criteria into test cases, the implementation and the design pattern used for the solution, validations, and error handling.

Story

As a developer, I need an API that allows me to create a shipment by passing the shipment carrier ID that I would like to use, and the set of parameters needed to get the shipment profile created with the shipping service itself.
Acceptance Criteria

· For this assignment, please consider the following assumptions:
o FedEx ID: fedex
o UPS ID: ups
o FedEx  service shipment creation request required fields.
§ carrierServiceID: [string]  
· valid carrierService IDs: fedexAIR, fedexGroud
§ packageDetails
· width [cm]
· height [cm]
· length [cm]
· weight [gram]
o UPS service shipment creation request required fields.
§ shipmentServiceID: [string]  
· valid shipmentService IDs: UPSExpress, UPS2DAY
§ package
· width [inch]
· height [inch]
· length [inch]
· weight [pound]
o Note: for this assignment, we do not care about calling external services but how to create and design an API that could handle these differences and provide a single API to interact with these differences behind the scenes.
2 / 2
· The API shall respond back with a confirmation that the shipment has been placed successfully and if the input fields were incorrect and the type is incorrect, the correct error message shall be passed to the customer.
Deliverables
