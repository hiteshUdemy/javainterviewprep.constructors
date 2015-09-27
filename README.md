# javainterviewprep.constructors
##Exercise 1 - Design Domain Entities for College
###Section A
* Create a Class Lecture.
* Attributes of the class are: lectureId, startTime, endTime and presenter.
* An object of Class Lecture should have lectureId, startTime and endTime at time of creation.
* Capability to Print Lecture Schedule.

###Section B
* Create a Class ExtraLecture which IS A Lecture.
* Attribute of the class are: reasonForExtraLecture.
* An object of Class ExtraLecture should have reasonForExtraLecture, lectureId, startTime and endTime at time of creation.
* Capability to Print ExtraLecture Schedule.

##Exercise 2 - Design Domain Entities for Car Rental
###Section A
* Create a Class RentalAgreement.
* Attributes for Class RentalAgreement are: agreementId, rentalBaseRate, carType, rentalStartDate, rentalEndDate and paymentMethod.
* An object of Class RentalAgreement should have agreementId, rentalBaseRate, carType, rentalStartDate, rentalEndDate at time of creation.
* Capability to Print the estimated Rental Cost.

###Section B
* Create a Class ExtendRentalAgreement.
* ExtendRentalAgreement HAS A RentalAgreement.
* Attributes for Class ExtendRentalAgreement are extendedRentalEndDate, escalatedRentalRate.
* Capability to Print the ExtraCost for the extended rental.
