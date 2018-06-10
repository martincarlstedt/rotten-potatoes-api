package banken.integrations.rottentomatoes.model

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.junit.Test

class DefaultListTest {

    @Test
    fun `should parse from json`() {
        jacksonObjectMapper().readValue<List<TomatoPopularMovie>>(response)
    }

    companion object {
        val response = """[
    {
        "title": "Solo: A Star Wars Story",
        "id": "771421829",
        "url": "/m/solo_a_star_wars_story",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/xqquVV7h4CpMzvqj6ClLoxp4XuE=/fit-in/110x150/v1.bTsxMjcwODEwNztqOzE3NzQyOzEyMDA7NDgwOzcxMQ"
    },
    {
        "title": "Deadpool 2",
        "id": "771438314",
        "url": "/m/deadpool_2",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/LDmcgr-fsqUDU4CXAZWKeoMmH6w=/fit-in/110x150/v1.bTsxMjczNDc3MTtqOzE3NzQyOzEyMDA7NjQ4Ozk2MA"
    },
    {
        "title": "Adrift",
        "id": "771490027",
        "url": "/m/adrift_2018",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/-8pBfQAWp1CDqZs_5IRS30HlMPc=/fit-in/110x150/v1.bTsxMjcyMTMxMztqOzE3NzQyOzEyMDA7ODEwMDsxMjAwMA"
    },
    {
        "title": "Avengers: Infinity War",
        "id": "771401853",
        "url": "/m/avengers_infinity_war",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/TNRE1xMnz1wW5GS7n5vu6UXtiv8=/fit-in/110x150/v1.bTsxMjcwMDQ5MztqOzE3NzQxOzEyMDA7MTY4ODsyNTAw"
    },
    {
        "title": "Book Club",
        "id": "771490359",
        "url": "/m/book_club",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/bCNAQnHQ3AhhdjIJm9X1fg_rO_8=/fit-in/110x150/v1.bTsxMjcwNTg1NTtqOzE3NzQyOzEyMDA7MTc0MDsyNzEy"
    },
    {
        "title": "Upgrade",
        "id": "771490017",
        "url": "/m/upgrade_2018",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/0-XPTdhbLOz4cOPc3SxLAU8XQ8g=/fit-in/110x150/v1.bTsxMjcwMzkxOTtqOzE3NzQyOzEyMDA7MjAyNTszMDAw"
    },
    {
        "title": "Life of the Party",
        "id": "771446621",
        "url": "/m/life_of_the_party_2018",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/LZqp8gTzIsHy6YcH3B-me1uvphI=/fit-in/110x150/v1.bTsxMjcxNzk1NjtqOzE3NzQyOzEyMDA7Mjc2NDs0MDk2"
    },
    {
        "title": "Breaking In",
        "id": "771489501",
        "url": "/m/breaking_in_2018",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/8-q4ZH7kAtF4OCoEgYY95YY5otI=/fit-in/110x150/v1.bTsxMjY3ODE4MztqOzE3NzQxOzEyMDA7NjcyOzEwNjQ"
    },
    {
        "title": "Action Point",
        "id": "771470453",
        "url": "/m/action_point",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/-9mncWrD5GHR2tgDkpZhp3RBK1A=/fit-in/110x150/v1.bTsxMjcyMTY5ODtqOzE3NzQyOzEyMDA7MjIwMzszMjYz"
    },
    {
        "title": "Overboard",
        "id": "771474940",
        "url": "/m/overboard_2018",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/OqNIg3HfJgkkdrXhkojJlTyMSCs=/fit-in/110x150/v1.bTsxMjY3OTEwMTtqOzE3NzQxOzEyMDA7NjIwMDs4ODAw"
    },
    {
        "title": "Ocean's 8",
        "id": "771433721",
        "url": "/m/oceans_8",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/QI-zu601HfevlS08HK6-ESelJQY=/fit-in/110x150/v1.bTsxMjczNTYzMDtqOzE3NzQyOzEyMDA7NDA1MDs2MDAw"
    },
    {
        "title": "Hereditary",
        "id": "771489934",
        "url": "/m/hereditary",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/J71UCjK-2F4oY36zxSNayzujMR0=/fit-in/110x150/v1.bTsxMjc0NDczNTtqOzE3NzQyOzEyMDA7MjAyNTszMDAw"
    },
    {
        "title": "Hotel Artemis",
        "id": "771492975",
        "url": "/m/hotel_artemis",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/mPvbh85pm_pca8VeLF5FsbFiVts=/fit-in/110x150/v1.bTsxMjc0MzkyNDtwOzE3NzQyOzEyMDA7NTI3OzgyOQ"
    },
    {
        "title": "Won't You Be My Neighbor?",
        "id": "771488161",
        "url": "/m/wont_you_be_my_neighbor",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/BMqZOBC3KViAnYsEaXFrwFqbThM=/fit-in/110x150/v1.bTsxMjcxNzA5OTtqOzE3NzQyOzEyMDA7NDA1MDs2MDAw"
    },
    {
        "title": "Hearts Beat Loud",
        "id": "771489082",
        "url": "/m/hearts_beat_loud",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/YS_xOU0pMXvliTghcQQnoO6LcGc=/fit-in/110x150/v1.bTsxMjcwNDYzODtqOzE3NzQyOzEyMDA7MTMwNTsxODkw"
    },
    {
        "title": "2036 Origin Unknown",
        "id": "771493512",
        "url": "/m/2036_origin_unknown",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/uOeBSgTB5Doun5cGRWolRAuKHO0=/fit-in/110x150/v1.bTsxMjczNDc4NDtqOzE3NzQyOzEyMDA7MTA4MDsxNjAw"
    },
    {
        "title": "Nancy",
        "id": "771489099",
        "url": "/m/nancy",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/9JefLa85Hls_CVJqP68ZV_5gTgA=/fit-in/110x150/v1.bTsxMjczMDY0NDtqOzE3NzQyOzEyMDA7MjAyNTszMDAw"
    },
    {
        "title": "Westwood: Punk, Icon, Activist",
        "id": "771484701",
        "url": "/m/westwood_punk_icon_activist",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/quk7NX4wdReaSNB0ocCx8QNPdRs=/fit-in/110x150/v1.bTsxMjY5Mjc1OTtqOzE3NzQxOzEyMDA7NTA5Ozc1NQ"
    },
    {
        "title": "Zoo",
        "id": "771492846",
        "url": "/m/zoo_2018",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/cd6hseKpdxAWDA3rPeq6cinq_9I=/fit-in/110x150/v1.bTsxMjcyMjYwNDtqOzE3NzQyOzEyMDA7MjAyNTszMDAw"
    },
    {
        "title": "Bernard and Huey",
        "id": "771457113",
        "url": "/m/bernard_and_huey",
        "year": 2018,
        "posterUrl": "https://resizing.flixster.com/rV_UhFSs_2GRUQuSPw5qjLxks84=/fit-in/110x150/v1.bTsxMjc0NzM2MztqOzE3NzQyOzEyMDA7MzU4OzU0MQ"
    }
]"""
    }
}

