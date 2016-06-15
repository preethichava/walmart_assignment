# walmart_assignment
walmart assigment to use search, recomendation and sort functionality using walmart api.
AIM:
This application is to rank-order Walmart product recommendations based upon customer reviews which invokes the Walmart Labs Open API to implement the workflow.
The main aim of the application is to 
⦁	Search for products based upon a user-provided search string
⦁	Use the first item in the search response as input for a product recommendation search
⦁	Retrieve reviews of the first 10 product recommendations
⦁	Rank order the recommended products based upon the review sentiments.

Structure of the project:
main java classes are in src/assignment
1.JsonParser.java
2.Product.java(POJO class)
3.TestpidPR.java(Test class)

Dependencies are in lib folder.
These are the following dependencies:
commons-codec-1.9.jar
commons-logging-1.2.jar
httpclient-4.4.jar
httpcore-4.4.jar
java.json.jar
json-simple-1.1.jar
json-20131018.jar

How to execute via command line:

Download the project.Download the assignment_runnable.jar from the github repository.
Go to the Path of the downloaded project and jar in command prompt,then give the following command

java -jar assignment_runnable.jar flight

here flight is the argument to be passed.It could be any string that is used to search like watch,lights etc.

Output:
The output obtained is as follows::

Microsoft Windows [Version 10.0.10586]
(c) 2015 Microsoft Corporation. All rights reserved.

C:\Users\preethi\workspace\walmart_assignment>java -jar assignment_runnable.jar flight
 The first product appeared in the search is
   FLIGHT (DVD) -- 26905910

product recommendations and their reviews :






25736859----Olympus Has Fallen (With INSTAWATCH) (Widescreen)----0.0
average overall rating - 4.72
review --- 1
Morgan Freeman and Gerard Butler!  That's reason enough to watch this movie.  Great action scenes. Great story line.
review --- 2
it was a very good movie and keep us entertained.
review --- 3
This was the movie before London has Fallen. Great cast.
review --- 4
Love price
review --- 5
Awesome movie. I enjoy getting these movies even faster on VUDU and easy pickup at my local Walmart.




24553097----Mud (DVD + Digital UltraViolet) (With INSTAWATCH) (Widescreen)----0.0
average overall rating - 5.0
review --- 1
Mud has great acting, great writing, a great story, and a powerful message. I can see this movie being up for a couple academy awards!
review --- 2
Great movie.
review --- 3
Matthew and the two boys show what trust and friendship really is. Good times and bad....




24230322----JACK THE GIANT SLAYER (DVD/2013/WS/ULTRAVIOLET)----0.0
average overall rating - 4.5
review --- 1
It good movie
review --- 2
I really like this movie. My granddaughter whom is almost 6 yrs old picked it out. She saw it at the theatre with her parents and liked it. I only gave it 4 stars because Vudu Instawatch is in Standard Definition, not High Definition. Most of the time we dont use the discs, but I like to have them just incase the internet goes down. So to have an HD Digital copy is much more preferable to us.




28877349----GANGSTER SQUAD (BLU-RAY/DVD/2 DISC COMBO/FF-16X9)----0.0
average overall rating - 3.0
review --- 1
Good gangster movie.  Good acting, good plot, kept my attention.




21957948----Ice Age 4: Continental Drift (Widescreen)----0.0
average overall rating - 4.71
review --- 1
great movie for the grandkids.t
review --- 2
It was a little disappointing compared to the other Ice Age movies and I believe the storyline gets you ready for the next one which will probably be better. The pirate thing was stupid and totally had nothing to do with any of the storylines of ice age. We watch the others many times. We will not watch this one again because the story line with the pirates was so stupid.
review --- 3
just as good as the other Ice Age movies
review --- 4
I like the little clips with the squirrel and nuts.
review --- 5
A great movie for my 5 year oid grandson, he loves it. Received it yesterday evening and he was watching it last nite! And mommy and NaNa loves it too! Keep up w/the Wal-mart daily specials for it makes the price fantastic.




23746389----SNITCH (BLU RAY/ULTRAVIOLET/ENG/ENG SUB/SPAN SUB/5.1 DOL DIG)----0.0
average overall rating - 4.25
review --- 1
Snitch is great movie that was based on a PBS Frontline story about the culture of snitching within the federal penal system. The movie shows Dwayne Johnson as a concerned father and not the tough guy we all come to expect. The movie shows Dwayne Johnson's acting chops. We movie is well done and had me interested the whole way through. The supporting cast was also exceptional to include Susan Sarandon, Benjamin Bratt, Barry Pepper, and Jon Bernthal. Jon Bernthal who you will know from the Walking Dead. I enjoyed this movie and would definitely recommend it.

Thank you for reading my review.
review --- 2
good movie but the case was broken




24775357----Oblivion (With INSTAWATCH) (Widescreen)----0.0
average overall rating - 4.47
review --- 1
Great movie - one of Tom Cruise's best SCIFI films in recent years
review --- 2
just when you think you know everything--you don't!! will watch again! good entertainment!
review --- 3
I was unable to view the movie on the DVD I purchased from Walmart.com because it was flawed. The picture kept stalling then advancing past scenes and stalling again. I watched the movie ON DEMAND on TV twice. It was really a good movie. I am now afraid to order DVDs from Walmart.com. I think I'll stick to Amazon.com.
review --- 4
Being a scifi nut, this is my kind of movie. The plot has a nice twist to it and the CG is very good as well. This real plus is that for me, it ends well !!!!!
review --- 5
PROMPT DELIVERY..... GOOD MOVIE, WELL ACTED BY TOM CRUISE ....

AND INSTA WATCH IS A GREAT IDEA: NICE TO BE ABLE TO VIEW A MOVIE VIA VUDU

WITH JUST A CLICK OF THE REMOTE.




22726064----Argo (Blu-ray + DVD + Digital HD) (With INSTAWATCH) (Widescreen)----0.0
average overall rating - 3.29
review --- 1
The movie is awesome. That said, can anyone tell me why WalMart, the largest retailer in the world, can't deliver a DVD/Blu-Ray via SITE TO STORE in under three weeks?!?!?

The ONLY good thing was the VUDU/InstaWatch digital copy was active within minutes.

Fast-Forward a couple weeks and I just purchased the new Mission Impossible movie disc/digital combo pack and guess what...NO DIGITAL AVAILABLE until I receive the discs at pick-up ?!?!?

Such a shame that Amazon and everyone else can get you items delivered to your door in two days but WalMart can't even do site to store in less than three weeks of an item that is IN STOCK at many locations (not mine) and I could have bought at Target up the street.

Bummer
review --- 2
Shipped me the wrong Bluray movie. I purchased the (Bluray+ Dvd+ UltraViolet) and I was sent just the Bluray copy.
review --- 3
My family really liked the movie. HOWEVER, we bought this combo version because of the listed special features. Except for one brief documentary on the DVD, the special features are ONLY on the Blu-ray disc. So, after we watched the movie, we were very disappointed, since we only have a DVD player. Also, we knew ahead of time that the UltraViolet version offer had already expired, but the stores should put a big sticker or something on the package showing that it has expired. Why is the digital copy available for so short a period of time?

That is why my ratings are so different. We'd give the actual movie 5 stars, but the rest of the purchasing experience was disappointing.
review --- 4
okay
review --- 5
Argo was a film portraying an actual event. Overall, I did not find the film entertaining. It was OK but not distinguisable. Thus, a generous rating of 2.




22177578----End Of Watch (Anamorphic Widescreen)----0.0
average overall rating - 5.0
review --- 1
great story, action and filming.




17491941----The Hangover Part II (With INSTAWATCH) (Widescreen)----0.0
average overall rating - 4.53
review --- 1
I got this as a gift for my brother. The movie was pretty good though it wasn't as funny as the first i thought. The only problem i had with the movie is that i couldn't get it to play full-screen.
review --- 2
I was able to find the movie i wanted fast in good environment and exlent value
thank you walmart
review --- 3
A great movie.
review --- 4
While I REALLY liked the 1st =Hangover movie & couldn't wait to get this one I must admit was a bit disappointed in the 2nd one. Pretty much same story just different setting & much more vulgar. Would not reccommend for family veiwing
review --- 5
the first one was a lot better. this was an okay movie, i guess.
24553097----Mud (DVD + Digital UltraViolet) (With INSTAWATCH) (Widescreen)----5.0
22177578----End Of Watch (Anamorphic Widescreen)----5.0
25736859----Olympus Has Fallen (With INSTAWATCH) (Widescreen)----4.72
21957948----Ice Age 4: Continental Drift (Widescreen)----4.71
17491941----The Hangover Part II (With INSTAWATCH) (Widescreen)----4.53
24230322----JACK THE GIANT SLAYER (DVD/2013/WS/ULTRAVIOLET)----4.5
24775357----Oblivion (With INSTAWATCH) (Widescreen)----4.47
23746389----SNITCH (BLU RAY/ULTRAVIOLET/ENG/ENG SUB/SPAN SUB/5.1 DOL DIG)----4.25
22726064----Argo (Blu-ray + DVD + Digital HD) (With INSTAWATCH) (Widescreen)----3.29
28877349----GANGSTER SQUAD (BLU-RAY/DVD/2 DISC COMBO/FF-16X9)----3.0

C:\Users\preethi\workspace\walmart_assignment>


