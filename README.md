This is for Nulogy's Link Apprenticeship Coding Exercise


Runtime Versions/Dependencies
===============

* jdk-1.8
* junit-4.12


Command Line Instructions
===============

run java /pathto/RepackagerCalculatorTest





Assumptions
===============
Looking at the Pricing Problem below, nothing assumes that an item could not be more than one type, i.e. a food and electronic item. Assuming these markups would build on each other.

Used BigDecimal has it is more accurate for monetary calculations due to rounding capabilities

Due to time constraints, was not able to write full test code and implement more complex code to solve issue. 


Pricing problem
===============
NuPack is responsible for taking existing products and repackaging them for sale at electronic stores like Best Buy. Companies will phone up NuPack, explain the process and NuPack needs to quickly give them an estimate of how much it will cost. Different markups to the job:

* Without exception, there is a flat markup on all jobs of 5%
* For each person that needs to work on the job, there is a markup of 1.2%

Markups are also added depending on the types of materials involved:

* If pharmaceuticals are involved, there is an immediate 7.5% markup
* For food, there is a 13% markup
* Electronics require a 2% markup
* Everything else, there is no markup

Another system calculates the base price depending on how many products need to be repackaged. As such, the markup calculator should accept the initial base price along with the different categories of markups and calculate a final cost for a project.

The flat markup is calculated first and then all other markups are calculated on top of the base price plus flat markup.

Example 1:
----------
    Input:  $1,299.99, 3 people, food
    Output: $1,591.58

Example 2:
----------
    Input:  $5,432.00, 1 person, drugs
    Output: $6,199.81

Example 3:
----------
    Input:  $12,456.95, 4 people, books
    Output: $13,707.63
