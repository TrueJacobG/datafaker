package net.datafaker.service.files;

import java.util.List;
import java.util.stream.Stream;

public class EnFile {
    private static final String YML = ".yml";
    private final String file;
    private final String path;

    private EnFile(String file) {
        this(file, file.endsWith(YML) ? file.substring(0, file.length() - YML.length()) : file);
    }

    private EnFile(String file, String path) {
        this.file = file;
        this.path = path;
    }

    public String getFile() {
        return file;
    }

    public String getPath() {
        return path;
    }

    private static final List<EnFile> FILES = Stream.of(
        "address.yml",
        "ancient.yml",
        "animal.yml",
        "app.yml",
        "appliance.yml",
        "aqua_teen_hunger_force.yml",
        "artist.yml",
        "australia.yml",
        "aviation.yml",
        "aws.yml",
        "azure.yml",
        "babylon5.yml",
        "back_to_the_future.yml",
        "barcode.yml",
        "baseball.yml",
        "basketball.yml",
        "battlefield1.yml",
        "beer.yml",
        "big_bang_theory.yml",
        "blood_type.yml",
        "boardgame.yml",
        "bojack_horseman.yml",
        "book.yml",
        "bossa_nova.yml",
        "brand.yml",
        "breaking_bad.yml",
        "brooklyn_nine_nine.yml",
        "buffy.yml",
        "business.yml",
        "camera.yml",
        "cannabis.yml",
        "chuck_norris.yml",
        "clash_of_clans.yml",
        "control.yml",
        "chiquito.yml",
        "chess.yml",
        "code.yml",
        "coffee.yml",
        "coin.yml",
        "color.yml",
        "commerce.yml",
        "community.yml",
        "company.yml",
        "computer.yml",
        "compass.yml",
        "detective_conan.yml",
        "doraemon.yml",
        "construction.yml",
        "cosmere.yml",
        "country.yml",
        "cowboy_bebop.yml",
        "cricket.yml",
        "crypto_coin.yml",
        "culture_series.yml",
        "currency.yml",
        "dc_comics.yml",
        "dark_souls.yml",
        "demographic.yml",
        "departed.yml",
        "dessert.yml",
        "device.yml",
        "domain.yml",
        "dnd.yml",
        "dota2.yml",
        "dr_who.yml",
        "dragon_ball.yml",
        "driving_license.yml",
        "drone.yml",
        "dumb_and_dumber.yml",
        "dune.yml",
        "educator.yml",
        "elden_ring.yml",
        "elder_scrolls.yml",
        "electrical_components.yml",
        "emoji.yml",
        "esport.yml",
        "englandfootball.yml",
//            "fallout.yml",
        "family_guy.yml",
        "fallout.yml",
        "famous_last_words.yml",
        "file.yml",
        "final_fantasy_xiv.yml",
        "final_space.yml",
        "finance.yml",
        "financial_terms.yml",
        "food.yml",
        "football.yml",
        "formula1.yml",
        "fresh_prince_of_bel_air.yml",
        "friends.yml",
        "fma_brotherhood.yml",
        "funny_name.yml",
        "futurama.yml",
        "game_of_thrones.yml",
        "garments_sizes.yml",
//            "game.yml",
        "gender.yml",
        "ghostbusters.yml",
        "grateful_dead.yml",
        "greek_philosophers.yml",
        "hacker.yml",
        "half_life.yml",
        "harry_potter.yml",
        "hearthstone.yml",
        "heroes.yml",
        "heroes_of_the_storm.yml",
        "hey_arnold.yml",
        "hipster.yml",
        "hitchhikers_guide_to_the_galaxy.yml",
        "hobbit.yml",
        "hobby.yml",
        "hololive.yml",
        "house.yml",
        "how_i_met_your_mother.yml",
        "how_to_train_your_dragon.yml",
        "id_number.yml",
        "industry_segments.yml",
        "internet.yml",
        "job.yml",
        "joke.yml",
        "kpop.yml",
        "largelanguagemodel.yml",
        "lebowski.yml",
        "location.yml",
        "lord_of_the_rings.yml",
        "lorem.yml",
//            "lovecraft.yml",
//            "markdown.yml",
        "marketing.yml",
        "mass_effect.yml",
        "matz.yml",
        "measurement.yml",
        "mbti.yml",
        "medical.yml",
        "michael_scott.yml",
        "military.yml",
        "minecraft.yml",
        "money_heist.yml",
        "most_interesting_man_in_the_world.yml",
        "mood.yml",
        "movie.yml",
        "mountain.yml",
        "mountaineering.yml",
        "music.yml",
//            "myst.yml",
        "name.yml",
        "naruto.yml",
        "nation.yml",
        "nato_phonetic_alphabet.yml",
        "new_girl.yml",
        "one_piece.yml",
//            "opera.yml",
        "nigeria.yml",
        "overwatch.yml",
        "olympic_sport.yml",
        "oscar_movie.yml",
//            "parks_and_rec.yml",
//            "phish.yml",
        "passport.yml",
        "phone_number.yml",
        "photography.yml",
        "planet.yml",
        "pokemon.yml",
        "princess_bride.yml",
        "programming_language.yml",
        "pronouns.yml",
        "red_dead_redemption2.yml",
        "relationship.yml",
        "restaurant.yml",
        "rick_and_morty.yml",
        "robin.yml",
        "rock_band.yml",
        "rupaul.yml",
        "science.yml",
        "seinfeld.yml",
        "shakespeare.yml",
        "show.yml",
        "silicon_valley.yml",
        "simpsons.yml",
        "sip.yml",
        "size.yml",
        "slack_emoji.yml",
//            "sonic_the_hedgehog.yml",
        "south_park.yml",
        "soul_knight.yml",
        "space.yml",
        "spongebob.yml",
        "starcraft.yml",
        "star_trek.yml",
        "star_wars.yml",
        "stargate.yml",
        "stock.yml",
        "stranger_things.yml",
        "studio_ghibli.yml",
        "subscription.yml",
        "suits.yml",
//            "super_smash_bros.yml",
        "superhero.yml",
        "supernatural.yml",
        "sword_art_online.yml",
        "tea.yml",
        "team.yml",
        "tire.yml",
        "the_expanse.yml",
        "the_it_crowd.yml",
        "the_kingkiller_chronicle.yml",
        "the_room.yml",
        "the_thick_of_it.yml",
        "tron.yml",
        "transport.yml",
        "twitter.yml",
        "twin_peaks.yml",
//            "umphreys_mcgee.yml",
        "university.yml",
        "v_for_vendetta.yml",
        "vehicle.yml",
        "video_game.yml",
        "volleyball.yml",
        "the_venture_bros.yml",
        "verbs.yml",
        "weather.yml",
        "words.yml",
        "witcher.yml",
        "kaamelott.yml",
        "touhou.yml",
//            "world_of_warcraft.yml",
        "yoda.yml",
        "zelda.yml",
        "zodiac.yml").map(EnFile::new).toList();

    // files where the search path can't be derived from the filename
    private static final List<EnFile> FILES_WITH_A_DIFFERENT_PATH = List.of(
        new EnFile("animal.yml", "creature"),
        new EnFile("cat.yml", "creature"),
        new EnFile("dog.yml", "creature"),

        new EnFile("dota2.yml", "games"),
        new EnFile("elder_scrolls.yml", "games"),
        new EnFile("half_life.yml", "games"),
        new EnFile("hearthstone.yml", "games"),
        new EnFile("horse.yml", "creature"),
        new EnFile("league_of_legends.yml", "games"),
        new EnFile("marvel_snap.yml", "games"),
        new EnFile("myst.yml", "games"),
        new EnFile("overwatch.yml", "games"),
        new EnFile("pokemon.yml", "games"),
        new EnFile("resident_evil.yml", "games"),
        new EnFile("sonic_the_hedgehog.yml", "games"),
        new EnFile("super_mario.yml", "games"),
        new EnFile("super_smash_bros.yml", "games"),
        new EnFile("street_fighter.yml", "games"),
        new EnFile("witcher.yml", "games"),
        new EnFile("warhammer_fantasy.yml", "games"),
        new EnFile("world_of_warcraft.yml", "games"),
        new EnFile("zelda.yml", "games"),

        new EnFile("phone_number.yml", "cell_phone"), // load phone number again with a different path

        new EnFile("care_provider.yml", "healthcare"),
        new EnFile("disease.yml", "healthcare"),
        new EnFile("medical_procedure.yml", "healthcare"),
        new EnFile("medication.yml", "healthcare"),
        new EnFile("observation.yml", "healthcare")
    );

    public static Stream<EnFile> getFiles() {
        return Stream.concat(FILES.stream(), FILES_WITH_A_DIFFERENT_PATH.stream());
    }
}
