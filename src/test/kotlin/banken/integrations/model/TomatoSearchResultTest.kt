package banken.integration.model

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.junit.Test
import kotlin.test.assertEquals

class TomatoSearchResultTest {
    @Test
    fun `should parse from json to`() {
        jacksonObjectMapper().readValue<TomatoSearchResult>(response)
    }

    @Test
    fun `should set id`() {
        assertEquals(TomatoSearchResultLinks("http://www.rottentomatoes.com/m/avengers_infinity_war/").getMovieId(), "avengers_infinity_war")
    }

    companion object {
        val response = """{
    "total": 122,
    "movies": [
        {
            "id": "771401853",
            "title": "Avengers: Infinity War",
            "year": 2018,
            "mpaa_rating": "PG-13",
            "runtime": 156,
            "critics_consensus": "",
            "release_dates": {
                "theater": "2018-04-27"
            },
            "ratings": {
                "critics_rating": "Certified Fresh",
                "critics_score": 83,
                "audience_rating": "Upright",
                "audience_score": 91
            },
            "synopsis": "An unprecedented cinematic journey ten years in the making and spanning the entire Marvel Cinematic Universe, Marvel Studios' \"Avengers: Infinity War\" brings to the screen the ultimate, deadliest showdown of all time. The Avengers and their Super Hero allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe.",
            "posters": {
                "thumbnail": "https://resizing.flixster.com/L4ChEud2obG5_r6R3xObrdqQsfs=/54x80/v1.bTsxMjcwMDQ5MztqOzE3NzQ5OzIwNDg7MTY4ODsyNTAw",
                "profile": "https://resizing.flixster.com/O8RG1lZcI6W2EoRdaDTYlEotXg8=/120x178/v1.bTsxMjcwMDQ5MztqOzE3NzQ5OzIwNDg7MTY4ODsyNTAw",
                "detailed": "https://resizing.flixster.com/pTooqFsIUcGR7KO8dR4MPuQJSS8=/180x267/v1.bTsxMjcwMDQ5MztqOzE3NzQ5OzIwNDg7MTY4ODsyNTAw",
                "original": "https://resizing.flixster.com/RNH2nazos7d7a0LcakSyK6EcUOI=/1688x2500/v1.bTsxMjcwMDQ5MztqOzE3NzQ5OzIwNDg7MTY4ODsyNTAw"
            },
            "abridged_cast": [
                {
                    "name": "Robert Downey Jr.",
                    "id": "162654529",
                    "characters": [
                        "Tony Stark/Iron Man"
                    ]
                },
                {
                    "name": "Chris Hemsworth",
                    "id": "770829335",
                    "characters": [
                        "Thor"
                    ]
                },
                {
                    "name": "Mark Ruffalo",
                    "id": "162653904",
                    "characters": [
                        "Bruce Banner/Hulk"
                    ]
                },
                {
                    "name": "Chris Evans",
                    "id": "162652784",
                    "characters": [
                        "Steve Rogers/Captain America"
                    ]
                },
                {
                    "name": "Scarlett Johansson",
                    "id": "162652872",
                    "characters": [
                        "Natasha Romanoff/Black Widow"
                    ]
                }
            ],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/771401853.json",
                "alternate": "http://www.rottentomatoes.com/m/avengers_infinity_war/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/771401853/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/771401853/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/771401853/similar.json"
            }
        },
        {
            "id": "771491753",
            "title": "Avengers: Infinity War - Opening Night Fan Event",
            "year": 2018,
            "mpaa_rating": "Unrated",
            "runtime": "",
            "release_dates": {
                "theater": "2018-04-27"
            },
            "ratings": {
                "critics_score": -1,
                "audience_rating": "Upright",
                "audience_score": 67
            },
            "synopsis": "On Thursday April 26, fans can be among the first to experience MARVEL STUDIOS AVENGERS: INFINITY WAR at Opening Night Fan Events in RealD 3D. In addition to seeing the film one hour early, fans attending will be treated to exclusive content, receive a collectible coin, and be given a special event only concession offer.",
            "posters": {
                "thumbnail": "https://resizing.flixster.com/6sygG-F_T5h1wGD0rD-HX6VspNI=/54x80/v1.bTsxMjY5OTYxNDtqOzE3NzcwOzIwNDg7MjAwOzI5Ng",
                "profile": "https://resizing.flixster.com/6qKVC8vuPJ4ZXKhP0rnbT3yxqLQ=/120x178/v1.bTsxMjY5OTYxNDtqOzE3NzcwOzIwNDg7MjAwOzI5Ng",
                "detailed": "https://resizing.flixster.com/VVSFvJ8GlyZFNGS52Sv4lycXTMY=/180x266/v1.bTsxMjY5OTYxNDtqOzE3NzcwOzIwNDg7MjAwOzI5Ng",
                "original": "https://resizing.flixster.com/nuzIHthaUHkLzcbri7bxK3OO3-A=/200x296/v1.bTsxMjY5OTYxNDtqOzE3NzcwOzIwNDg7MjAwOzI5Ng"
            },
            "abridged_cast": [],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/771491753.json",
                "alternate": "http://www.rottentomatoes.com/m/avengers_infinity_war_opening_night_fan_event/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/771491753/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/771491753/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/771491753/similar.json"
            }
        },
        {
            "id": "770740154",
            "title": "Marvel's The Avengers",
            "year": 2012,
            "mpaa_rating": "PG-13",
            "runtime": 142,
            "critics_consensus": "",
            "release_dates": {
                "theater": "2012-05-04",
                "dvd": "2012-09-25"
            },
            "ratings": {
                "critics_rating": "Certified Fresh",
                "critics_score": 92,
                "audience_rating": "Upright",
                "audience_score": 91
            },
            "synopsis": "Marvel Studios presents Marvel's The Avengers-the Super Hero team up of a lifetime, featuring iconic Marvel Super Heroes Iron Man, The Incredible Hulk, Thor, Captain America, Hawkeye and Black Widow. When an unexpected enemy emerges that threatens global safety and security, Nick Fury, Director of the international peacekeeping agency known as S.H.I.E.L.D., finds himself in need of a team to pull the world back from the brink of disaster. Spanning the globe, a daring recruitment effort begins. -- (C) Marvel",
            "posters": {
                "thumbnail": "https://resizing.flixster.com/k-iLCMfrV62dA8r9J7vuaz2Vrfk=/54x72/v1.bTsxMTIzMTk5MztqOzE3ODUyOzIwNDg7OTAwOzEyMDA",
                "profile": "https://resizing.flixster.com/UsQ5u-dDjjuWs_-h0xgyKiG6eAU=/120x160/v1.bTsxMTIzMTk5MztqOzE3ODUyOzIwNDg7OTAwOzEyMDA",
                "detailed": "https://resizing.flixster.com/Mxdbz_yXLFQY5oMCeyaInFm7atQ=/180x240/v1.bTsxMTIzMTk5MztqOzE3ODUyOzIwNDg7OTAwOzEyMDA",
                "original": "https://resizing.flixster.com/flJI0vtWRSgA4vH7z0Y-P-M9pxU=/900x1200/v1.bTsxMTIzMTk5MztqOzE3ODUyOzIwNDg7OTAwOzEyMDA"
            },
            "abridged_cast": [
                {
                    "name": "Robert Downey Jr.",
                    "id": "162654529",
                    "characters": [
                        "Tony Stark/Iron Man"
                    ]
                },
                {
                    "name": "Chris Evans",
                    "id": "162652784",
                    "characters": [
                        "Steve Rogers/Captain America"
                    ]
                },
                {
                    "name": "Mark Ruffalo",
                    "id": "162653904",
                    "characters": [
                        "Bruce Banner/The Hulk"
                    ]
                },
                {
                    "name": "Chris Hemsworth",
                    "id": "770829335",
                    "characters": [
                        "Thor"
                    ]
                },
                {
                    "name": "Scarlett Johansson",
                    "id": "162652872",
                    "characters": [
                        "Natasha Romanoff/Black Widow"
                    ]
                }
            ],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/770740154.json",
                "alternate": "http://www.rottentomatoes.com/m/marvels_the_avengers/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/770740154/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/770740154/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/770740154/similar.json"
            }
        },
        {
            "id": "771313962",
            "title": "Avengers: Age of Ultron",
            "year": 2015,
            "mpaa_rating": "PG-13",
            "runtime": 141,
            "critics_consensus": "",
            "release_dates": {
                "theater": "2015-05-01",
                "dvd": "2015-10-02"
            },
            "ratings": {
                "critics_rating": "Certified Fresh",
                "critics_score": 75,
                "audience_rating": "Upright",
                "audience_score": 83
            },
            "synopsis": "When Tony Stark jumpstarts a dormant peacekeeping program, things go awry and Earth's Mightiest Heroes, including Iron Man, Captain America, Thor, The Incredible Hulk, Black Widow and Hawkeye, are put to the ultimate test as they battle to save the planet from destruction at the hands of the villainous Ultron.",
            "posters": {
                "thumbnail": "https://resizing.flixster.com/Xeq9D03HpDIgUVGgNT1Enf6dmUc=/54x81/v1.bTsxMTE5MDE0MztqOzE3ODUyOzIwNDg7MTA0NzsxNTcy",
                "profile": "https://resizing.flixster.com/ML5Os8B46yEj1PDj0ZTVABucdNo=/120x180/v1.bTsxMTE5MDE0MztqOzE3ODUyOzIwNDg7MTA0NzsxNTcy",
                "detailed": "https://resizing.flixster.com/HulqGpuuaxvcSHToFvwQEPE3Dd8=/180x270/v1.bTsxMTE5MDE0MztqOzE3ODUyOzIwNDg7MTA0NzsxNTcy",
                "original": "https://resizing.flixster.com/kvB6yZOQ4rA7jIZ4ksumeiVbrpU=/1047x1572/v1.bTsxMTE5MDE0MztqOzE3ODUyOzIwNDg7MTA0NzsxNTcy"
            },
            "abridged_cast": [
                {
                    "name": "Robert Downey Jr.",
                    "id": "162654529",
                    "characters": [
                        "Tony Stark/Iron Man"
                    ]
                },
                {
                    "name": "Chris Evans",
                    "id": "162652784",
                    "characters": [
                        "Steve Rogers/Captain America"
                    ]
                },
                {
                    "name": "Mark Ruffalo",
                    "id": "162653904",
                    "characters": [
                        "Bruce Banner/The Hulk"
                    ]
                },
                {
                    "name": "Chris Hemsworth",
                    "id": "770829335",
                    "characters": [
                        "Thor"
                    ]
                },
                {
                    "name": "Linda Cardellini",
                    "id": "162667559"
                }
            ],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/771313962.json",
                "alternate": "http://www.rottentomatoes.com/m/avengers_age_of_ultron/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/771313962/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/771313962/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/771313962/similar.json"
            }
        },
        {
            "id": "770739679",
            "title": "Captain America: The First Avenger",
            "year": 2011,
            "mpaa_rating": "PG-13",
            "runtime": 124,
            "critics_consensus": "",
            "release_dates": {
                "theater": "2011-07-22",
                "dvd": "2011-10-25"
            },
            "ratings": {
                "critics_rating": "Certified Fresh",
                "critics_score": 79,
                "audience_rating": "Upright",
                "audience_score": 74
            },
            "synopsis": "Captain America: The First Avenger will focus on the early days of the Marvel Universe when Steve Rogers (Chris Evans) volunteers to participate in an experimental program that turns him into the Super Soldier known as Captain America. As Captain America, Rogers joins forces with Bucky Barnes (Sebastian Stan) and Peggy Carter (Hayley Atwell) to wage war on the evil HYDRA organization, led by the villainous Red Skull (Hugo Weaving.) -- (C) Paramount",
            "posters": {
                "thumbnail": "https://resizing.flixster.com/-rza3z7kHydacUvd0ycAUuxnxM0=/52x81/v1.bTsxMTE1ODMzOTtqOzE3ODE4OzIwNDg7MTc0NTsyNzI0",
                "profile": "https://resizing.flixster.com/ZrD9mhazKYdLKzO7AZXN63ounE0=/115x180/v1.bTsxMTE1ODMzOTtqOzE3ODE4OzIwNDg7MTc0NTsyNzI0",
                "detailed": "https://resizing.flixster.com/pt_pCelqlas7-s5L74i6Ru37Fas=/173x270/v1.bTsxMTE1ODMzOTtqOzE3ODE4OzIwNDg7MTc0NTsyNzI0",
                "original": "https://resizing.flixster.com/b479vku0U5ADyaRgy22j-RJa_Ww=/1745x2724/v1.bTsxMTE1ODMzOTtqOzE3ODE4OzIwNDg7MTc0NTsyNzI0"
            },
            "abridged_cast": [
                {
                    "name": "Chris Evans",
                    "id": "162652784",
                    "characters": [
                        "Captain America/Steve Rogers"
                    ]
                },
                {
                    "name": "Tommy Lee Jones",
                    "id": "162666788",
                    "characters": [
                        "Colonel Chester Phillips"
                    ]
                },
                {
                    "name": "Hugo Weaving",
                    "id": "162709905",
                    "characters": [
                        "Johann Schmidt/Red Skull"
                    ]
                },
                {
                    "name": "Hayley Atwell",
                    "id": "417268294",
                    "characters": [
                        "Peggy Carter"
                    ]
                },
                {
                    "name": "Sebastian Stan",
                    "id": "326299814",
                    "characters": [
                        "James Buchanan \"Bucky\" Barnes"
                    ]
                }
            ],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/770739679.json",
                "alternate": "http://www.rottentomatoes.com/m/captain_america_the_first_avenger/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/770739679/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/770739679/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/770739679/similar.json"
            }
        },
        {
            "id": "771432224",
            "title": "Untitled Avengers Movie",
            "year": 2019,
            "mpaa_rating": "Unrated",
            "runtime": "",
            "release_dates": {
                "theater": "2019-05-03"
            },
            "ratings": {
                "critics_score": -1,
                "audience_score": 99
            },
            "synopsis": "",
            "posters": {
                "thumbnail": "https://resizing.flixster.com/d_0NYlUE_-5FlGUxTGQuZ6CL9nQ=/54x77/v1.bTsxMjU5NzI0NztqOzE3Nzc3OzIwNDg7Mjg0OzQwNQ",
                "profile": "https://resizing.flixster.com/4lWaO7eV-LoJdAQ8fBIRow4Pm9U=/120x171/v1.bTsxMjU5NzI0NztqOzE3Nzc3OzIwNDg7Mjg0OzQwNQ",
                "detailed": "https://resizing.flixster.com/P26dA3mSDltdXci3EvelMT4FLow=/180x257/v1.bTsxMjU5NzI0NztqOzE3Nzc3OzIwNDg7Mjg0OzQwNQ",
                "original": "https://resizing.flixster.com/tluGihyKUS-vkqUTQC3tzxJAKPA=/284x405/v1.bTsxMjU5NzI0NztqOzE3Nzc3OzIwNDg7Mjg0OzQwNQ"
            },
            "abridged_cast": [],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/771432224.json",
                "alternate": "http://www.rottentomatoes.com/m/untitled_avengers_movie/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/771432224/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/771432224/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/771432224/similar.json"
            }
        },
        {
            "id": "11645",
            "title": "The Avengers",
            "year": 1998,
            "mpaa_rating": "PG-13",
            "runtime": 90,
            "critics_consensus": "",
            "release_dates": {
                "theater": "1998-08-14",
                "dvd": "2001-07-03"
            },
            "ratings": {
                "critics_rating": "Rotten",
                "critics_score": 5,
                "audience_rating": "Spilled",
                "audience_score": 15
            },
            "synopsis": "",
            "posters": {
                "thumbnail": "https://resizing.flixster.com/0BYBCWDrnkAiswNZAqzaEC7JIuU=/54x72/v1.bTsxMTIwNzczMTtqOzE3ODQ1OzIwNDg7MTUzNjsyMDQ4",
                "profile": "https://resizing.flixster.com/rqtkxD7L3hJcXoFRcHa93iJQw6M=/120x160/v1.bTsxMTIwNzczMTtqOzE3ODQ1OzIwNDg7MTUzNjsyMDQ4",
                "detailed": "https://resizing.flixster.com/YTR-m2cv87X31KgDYiLavRSvDG0=/180x240/v1.bTsxMTIwNzczMTtqOzE3ODQ1OzIwNDg7MTUzNjsyMDQ4",
                "original": "https://resizing.flixster.com/uCJCXNsoeeO2xQeesyLEDe8bTXA=/1536x2048/v1.bTsxMTIwNzczMTtqOzE3ODQ1OzIwNDg7MTUzNjsyMDQ4"
            },
            "abridged_cast": [
                {
                    "name": "Ralph Fiennes",
                    "id": "162653681",
                    "characters": [
                        "John Steed"
                    ]
                },
                {
                    "name": "Uma Thurman",
                    "id": "162654901",
                    "characters": [
                        "Emma Peel"
                    ]
                },
                {
                    "name": "Sean Connery",
                    "id": "162656350",
                    "characters": [
                        "Sir August de Wynter"
                    ]
                },
                {
                    "name": "Eileen Atkins",
                    "id": "162663863",
                    "characters": [
                        "Alice"
                    ]
                },
                {
                    "name": "Eddie Izzard",
                    "id": "162676569",
                    "characters": [
                        "Bailey"
                    ]
                }
            ],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/11645.json",
                "alternate": "http://www.rottentomatoes.com/m/1083461-avengers/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/11645/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/11645/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/11645/similar.json"
            }
        },
        {
            "id": "771371799",
            "title": "Avengers Confidential: Black Widow & Punisher",
            "year": 2013,
            "mpaa_rating": "PG-13",
            "runtime": 83,
            "release_dates": {
                "dvd": "2014-03-24"
            },
            "ratings": {
                "critics_score": -1,
                "audience_rating": "Spilled",
                "audience_score": 45
            },
            "synopsis": "When The Punisher takes out a black market weapons dealer with stolen S.H.I.E.L.D. tech, he inadvertently stumbles upon a much larger terror plot under investigation by Black Widow, agent of S.H.I.E.L.D. Detained by the clandestine law enforcement organization, Nick Fury offers the Punisher his freedom in exchange for one mission; To work with Black Widow and stop the terrorist group known as LEVIATHAN.",
            "posters": {
                "thumbnail": "https://resizing.flixster.com/wHdg1FVDECa_S9H-kOyHQzEThww=/54x77/v1.bTsxMTE3NjQ1NjtqOzE3ODQ1OzIwNDg7Mjg0OzQwNQ",
                "profile": "https://resizing.flixster.com/SbhthrAVJsj4Lt7-4-3v9U2oGlY=/120x171/v1.bTsxMTE3NjQ1NjtqOzE3ODQ1OzIwNDg7Mjg0OzQwNQ",
                "detailed": "https://resizing.flixster.com/8yzLZuQZrRf7yhBez5OTrlWItv8=/180x257/v1.bTsxMTE3NjQ1NjtqOzE3ODQ1OzIwNDg7Mjg0OzQwNQ",
                "original": "https://resizing.flixster.com/9TekVSqBSJiE2_TZNt8ccMUdA4A=/284x405/v1.bTsxMTE3NjQ1NjtqOzE3ODQ1OzIwNDg7Mjg0OzQwNQ"
            },
            "abridged_cast": [
                {
                    "name": "Jennifer Carpenter",
                    "id": "162653772"
                },
                {
                    "name": "Brian Bloom",
                    "id": "364657631"
                },
                {
                    "name": "John Eric Bentley",
                    "id": "771048223"
                },
                {
                    "name": "Grant George",
                    "id": "770860232"
                },
                {
                    "name": "Kyle Herbert",
                    "id": "770779369"
                }
            ],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/771371799.json",
                "alternate": "http://www.rottentomatoes.com/m/avengers_confidential_black_widow_and_punisher/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/771371799/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/771371799/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/771371799/similar.json"
            }
        },
        {
            "id": "771272442",
            "title": "Avengers Marathon",
            "year": 2012,
            "mpaa_rating": "PG-13",
            "runtime": 330,
            "release_dates": {
                "theater": "2012-05-03"
            },
            "ratings": {
                "critics_score": -1,
                "audience_rating": "Upright",
                "audience_score": 90
            },
            "synopsis": "Get ready to watch the greatest Marvel movie event ever held at your local AMC Theatre on May 3rd! Experience THE ULTIMATE MARVEL MARATHON with six movies on one epic day. Watch the heroes' stories unfold as they assemble for the midnight premiere of The Avengers 3D! Here's a list of the six movies being shown at THE ULTIMATE MARVEL MARATHON: Iron Man, The Incredible Hulk, Iron Man 2, Thor in 3D, Captain America in 3D, The Avengers in 3D.",
            "posters": {
                "thumbnail": "https://d2a5cgar23scu2.cloudfront.net/static/images/redesign/poster_default_thumb.gif",
                "profile": "https://d2a5cgar23scu2.cloudfront.net/static/images/redesign/poster_default.gif",
                "detailed": "https://d2a5cgar23scu2.cloudfront.net/static/images/redesign/poster_default.gif",
                "original": "https://d2a5cgar23scu2.cloudfront.net/static/images/redesign/poster_default.gif"
            },
            "abridged_cast": [],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/771272442.json",
                "alternate": "http://www.rottentomatoes.com/m/avengers_marathon/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/771272442/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/771272442/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/771272442/similar.json"
            }
        },
        {
            "id": "771413917",
            "title": "Avengers Grimm",
            "year": 2015,
            "mpaa_rating": "Unrated",
            "runtime": 90,
            "release_dates": {
                "dvd": "2015-04-14"
            },
            "ratings": {
                "critics_score": -1,
                "audience_rating": "Spilled",
                "audience_score": 16
            },
            "synopsis": "This /fantasy adventure film directed by Jeremy M. Inman brings together a bevy of popular fairy tale characters for a new modern adventure. Rumpelstiltskin destroys the Magic Mirror and is catapulted to the modern world, where he is hunted by Cinderella, Sleeping Beauty, Snow White, and Rapunzel. Casper Van Dien, Lou Ferrigno and Lauren Parkinson star.",
            "posters": {
                "thumbnail": "https://resizing.flixster.com/Dp4R4snKkMROHlo_kTm6DyfML78=/54x77/v1.bTsxMTE5MTUyMztqOzE3ODM3OzIwNDg7Mjg0OzQwNQ",
                "profile": "https://resizing.flixster.com/qLlFHnE0yunhff3PegOIRmaHl_c=/120x171/v1.bTsxMTE5MTUyMztqOzE3ODM3OzIwNDg7Mjg0OzQwNQ",
                "detailed": "https://resizing.flixster.com/ocfyybR9r4dQO5B0NSOFrFs7Uvo=/180x257/v1.bTsxMTE5MTUyMztqOzE3ODM3OzIwNDg7Mjg0OzQwNQ",
                "original": "https://resizing.flixster.com/Cv11zg2yp9nV-3ZD8YjkpuoChO0=/284x405/v1.bTsxMTE5MTUyMztqOzE3ODM3OzIwNDg7Mjg0OzQwNQ"
            },
            "abridged_cast": [
                {
                    "name": "Casper Van Dien",
                    "id": "162676944",
                    "characters": [
                        "Rumpelstiltskin"
                    ]
                },
                {
                    "name": "Lauren Parkinson",
                    "id": "771066973",
                    "characters": [
                        "Snow White"
                    ]
                },
                {
                    "name": "Lou Ferrigno",
                    "id": "164558827"
                },
                {
                    "name": "Marah Fairclough",
                    "id": "771632234",
                    "characters": [
                        "Sleeping Beauty"
                    ]
                },
                {
                    "name": "Milynn Sarley",
                    "id": "771456264",
                    "characters": [
                        "Cinderella"
                    ]
                }
            ],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/771413917.json",
                "alternate": "http://www.rottentomatoes.com/m/avengers_grimm/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/771413917/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/771413917/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/771413917/similar.json"
            }
        },
        {
            "id": "771305661",
            "title": "Avengers Assemble Marathon",
            "year": 2012,
            "mpaa_rating": "Unrated",
            "runtime": "",
            "release_dates": {},
            "ratings": {
                "critics_score": -1,
                "audience_score": 75
            },
            "synopsis": "Join us for an evening of Avengers films leading up to the 12:01 AM premiere of THE AVENGERS in 3D. Enjoy drink specials, trivia, and more! Tickets are ${'$'}20 for all four films. CAPTAIN AMERICA: THE FIRST AVENGER (2011) After being deemed unfit for military service, Steve Rogers volunteers for a top secret research project that turns him into Captain America, a superhero dedicated to defending the United States. THOR (2011) The powerful but arrogant warrior Thor is cast out of the fantastic realm of Asgard and sent to live amongst humans on Earth, where he soon becomes one of their finest defenders. IRON MAN (2008) When wealthy industrialist Tony Stark is forced to build an armored suit after a life-threatening incident, he ultimately decides to use its technology to fight against evil. THE AVENGERS in 3D 12:01 AM Premiere To save the Earth from Loki and his army, Nick Fury and the international agency S.H.I.E.L.D. bring together a team of super humans to form The Avengers.",
            "posters": {
                "thumbnail": "https://d2a5cgar23scu2.cloudfront.net/static/images/redesign/poster_default_thumb.gif",
                "profile": "https://d2a5cgar23scu2.cloudfront.net/static/images/redesign/poster_default.gif",
                "detailed": "https://d2a5cgar23scu2.cloudfront.net/static/images/redesign/poster_default.gif",
                "original": "https://d2a5cgar23scu2.cloudfront.net/static/images/redesign/poster_default.gif"
            },
            "abridged_cast": [],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/771305661.json",
                "alternate": "http://www.rottentomatoes.com/m/avengers_assemble_marathon/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/771305661/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/771305661/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/771305661/similar.json"
            }
        },
        {
            "id": "771305660",
            "title": "Avengers Anthology",
            "year": 2012,
            "mpaa_rating": "Unrated",
            "runtime": "",
            "release_dates": {},
            "ratings": {
                "critics_score": -1,
                "audience_score": 0
            },
            "synopsis": "",
            "posters": {
                "thumbnail": "https://d2a5cgar23scu2.cloudfront.net/static/images/redesign/poster_default_thumb.gif",
                "profile": "https://d2a5cgar23scu2.cloudfront.net/static/images/redesign/poster_default.gif",
                "detailed": "https://d2a5cgar23scu2.cloudfront.net/static/images/redesign/poster_default.gif",
                "original": "https://d2a5cgar23scu2.cloudfront.net/static/images/redesign/poster_default.gif"
            },
            "abridged_cast": [],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/771305660.json",
                "alternate": "http://www.rottentomatoes.com/m/avengers_anthology/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/771305660/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/771305660/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/771305660/similar.json"
            }
        },
        {
            "id": "17524",
            "title": "The Toxic Avenger",
            "year": 1984,
            "mpaa_rating": "R",
            "runtime": 90,
            "critics_consensus": "",
            "release_dates": {
                "theater": "1984-04-11",
                "dvd": "1997-11-10"
            },
            "ratings": {
                "critics_rating": "Fresh",
                "critics_score": 70,
                "audience_rating": "Upright",
                "audience_score": 63
            },
            "synopsis": "",
            "posters": {
                "thumbnail": "https://resizing.flixster.com/7XTYCzqg2fy3hyNRHG9DrCmxZhs=/54x72/v1.bTsxMTIxMTE5NztqOzE3ODQ2OzIwNDg7MjQzMzszMjQ0",
                "profile": "https://resizing.flixster.com/XlDLsxK7Mij2VquJH7Ai8I-eGQY=/120x160/v1.bTsxMTIxMTE5NztqOzE3ODQ2OzIwNDg7MjQzMzszMjQ0",
                "detailed": "https://resizing.flixster.com/Kskpe1Ce9myceGL009g_2eoJy_s=/180x240/v1.bTsxMTIxMTE5NztqOzE3ODQ2OzIwNDg7MjQzMzszMjQ0",
                "original": "https://resizing.flixster.com/ggMUu5AiWmZEHq2uhRlS3BRG1io=/2433x3244/v1.bTsxMTIxMTE5NztqOzE3ODQ2OzIwNDg7MjQzMzszMjQ0"
            },
            "abridged_cast": [
                {
                    "name": "Mark Torgl",
                    "id": "761778498",
                    "characters": [
                        "Melvin Junko"
                    ]
                },
                {
                    "name": "Mitchell Cohen",
                    "id": "771767201"
                },
                {
                    "name": "Mitchell Cohen",
                    "id": "770708478",
                    "characters": [
                        "The Toxic Avenger"
                    ]
                },
                {
                    "name": "Cindy Manion",
                    "id": "771767202"
                },
                {
                    "name": "Andree Maranda",
                    "id": "364624791",
                    "characters": [
                        "Sara"
                    ]
                }
            ],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/17524.json",
                "alternate": "http://www.rottentomatoes.com/m/toxic_avenger/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/17524/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/17524/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/17524/similar.json"
            }
        },
        {
            "id": "301481458",
            "title": "Ultimate Avengers II",
            "year": 2006,
            "mpaa_rating": "PG-13",
            "runtime": 73,
            "release_dates": {
                "theater": "2006-08-08",
                "dvd": "2006-08-08"
            },
            "ratings": {
                "critics_score": -1,
                "audience_rating": "Spilled",
                "audience_score": 50
            },
            "synopsis": "",
            "posters": {
                "thumbnail": "https://resizing.flixster.com/MhFrZ0aKUzKHhoI2MVFPqtx4A_s=/54x72/v1.bTsxMTIxNDgwMztqOzE3ODUyOzIwNDg7MTAwNTsxMzQw",
                "profile": "https://resizing.flixster.com/Eby6j6feRqTbC7B10e203OSYtaw=/120x160/v1.bTsxMTIxNDgwMztqOzE3ODUyOzIwNDg7MTAwNTsxMzQw",
                "detailed": "https://resizing.flixster.com/6wlEB7pC08kx-5QvQau0qaKgY_U=/180x240/v1.bTsxMTIxNDgwMztqOzE3ODUyOzIwNDg7MTAwNTsxMzQw",
                "original": "https://resizing.flixster.com/49ePiT1O0K7VdnR8zyY1Q4AQkjY=/1005x1340/v1.bTsxMTIxNDgwMztqOzE3ODUyOzIwNDg7MTAwNTsxMzQw"
            },
            "abridged_cast": [
                {
                    "name": "Justin Gross",
                    "id": "289633120",
                    "characters": [
                        "Captain America"
                    ]
                },
                {
                    "name": "Grey DeLisle",
                    "id": "289633122",
                    "characters": [
                        "Janet Pym/Wasp"
                    ]
                },
                {
                    "name": "Michael Massee",
                    "id": "162725031",
                    "characters": [
                        "Bruce Banner"
                    ]
                },
                {
                    "name": "Michael Massey",
                    "id": "771520174",
                    "characters": [
                        "Bruce Banner"
                    ]
                },
                {
                    "name": "Marc Worden",
                    "id": "289633124",
                    "characters": [
                        "Tony Stark/Iron Man"
                    ]
                }
            ],
            "links": {
                "self": "http://api.rottentomatoes.com/api/private/v1.0/movies/301481458.json",
                "alternate": "http://www.rottentomatoes.com/m/ultimate_avengers_ii/",
                "cast": "http://api.rottentomatoes.com/api/private/v1.0/movies/301481458/cast.json",
                "reviews": "http://api.rottentomatoes.com/api/private/v1.0/movies/301481458/reviews.json",
                "similar": "http://api.rottentomatoes.com/api/private/v1.0/movies/301481458/similar.json"
            }
        }
    ],
    "links": {
        "self": "http://api.rottentomatoes.com/api/private/v1.0/movies.json?q=avengers&page_limit=30&page=1",
        "next": "http://api.rottentomatoes.com/api/private/v1.0/movies.json?q=avengers&page_limit=30&page=2"
    },
    "link_template": "//api.rottentomatoes.com/api/private/v1.0/movies.json?q={search-term}&page_limit={results-per-page}&page={page-number}"
}"""
    }

}
