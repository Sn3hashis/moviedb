package com.tmdb.moviedb.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Movie {
    @Id
    private int id;
    private boolean adult;
    private long budget;
    // @OneToMany(cascade = CascadeType.ALL)
    @OneToOne
    private Genres genres;
    private String homepage;
    private String imdb_id;
    private String original_language;
    private String original_title;
    private String overview;
    private double popularity;
    private String poster;
    // @OneToMany(cascade = CascadeType.ALL)
    @OneToOne
    private ProductionCompany productionCompany;
    private Date releaseDate;
    private long revenue;
    private double runtime;
    @OneToOne
    private MovieLanguage movieLanguage;
    private String status;
    private String title;
    private String tagline;
    private double voteAverage;
    private int voteCount;

    public Movie() {
    }

    public Movie(int id, boolean adult, long budget, Genres genres, String homepage, String imdb_id,
            String original_language, String original_title, String overview, double popularity, String poster,
            ProductionCompany productionCompany, Date releaseDate, long revenue, double runtime,
            MovieLanguage movieLanguage, String status, String title, String tagline, double voteAverage,
            int voteCount) {
        this.id = id;
        this.adult = adult;
        this.budget = budget;
        this.genres = genres;
        this.homepage = homepage;
        this.imdb_id = imdb_id;
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.popularity = popularity;
        this.poster = poster;
        this.productionCompany = productionCompany;
        this.releaseDate = releaseDate;
        this.revenue = revenue;
        this.runtime = runtime;
        this.movieLanguage = movieLanguage;
        this.status = status;
        this.title = title;
        this.tagline = tagline;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public ProductionCompany getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(ProductionCompany productionCompany) {
        this.productionCompany = productionCompany;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }

    public MovieLanguage getMovieLanguage() {
        return movieLanguage;
    }

    public void setMovieLanguage(MovieLanguage movieLanguage) {
        this.movieLanguage = movieLanguage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public String toString() {
        return "Movie [adult=" + adult + ", budget=" + budget + ", genres=" + genres + ", homepage=" + homepage
                + ", id=" + id + ", imdb_id=" + imdb_id + ", movieLanguage=" + movieLanguage + ", original_language="
                + original_language + ", original_title=" + original_title + ", overview=" + overview + ", popularity="
                + popularity + ", poster=" + poster + ", productionCompany=" + productionCompany + ", releaseDate="
                + releaseDate + ", revenue=" + revenue + ", runtime=" + runtime + ", status=" + status + ", tagline="
                + tagline + ", title=" + title + ", voteAverage=" + voteAverage + ", voteCount=" + voteCount + "]";
    }

}
