package net.datafaker.movie;

import net.datafaker.base.AbstractProvider;

/**
 * issue for: <a href="https://github.com/datafaker-net/datafaker/issues/159">159</a>
 *
 * @since 1.5.0
 * @author SickDawn
 */
public class DarkSoul extends AbstractProvider<MovieProviders> {

    public DarkSoul(final MovieProviders faker) {
        super(faker);
    }

    public String stats() {
        return resolve("dark_soul.stats");
    }

    public String covenants() {
        return resolve("dark_soul.covenants");
    }

    public String classes() {
        return resolve("dark_soul.classes");
    }

    public String shield() {
        return resolve("dark_soul.shield");
    }

}