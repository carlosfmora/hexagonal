# hexagonal


### Use Case

Usually:
- Take input
- validate business rules
- manipulate model state
- return output

pg 28


### Validating Business Rules
"A very pragmatic distinction between the two is that validating a business rule requires access to the current
state of the domain model while validating input does not"
"input validations is a syntactical validation, while a business rule is a semantic validation"
, pg 34

### Responsibilities of a Adapter (IN)
- Map request to Java objects
- Authorization checks (if apply)
- Validate input
- Map input to the input model of the use case
- Call the use case
- Map output of the use case back to the caller
- Return response
  pg 41

if anything goes wrong on the way and an exception is thrown, the adapter handler must translate the error into
a message that is sent back to the caller

### Responsibilities of an Adapter (OUT - Persistence)
- Take input
- Map input into database format
- Send input to database
- Map database output into application format
- Return output
