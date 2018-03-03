package com.example.demo.Controller;
import com.example.demo.Model.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import sun.java2d.cmm.Profile;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getFront(){
        return "index";
    }
    @RequestMapping(value = "/leagues", method = RequestMethod.GET)
    public ResponseEntity<League[]> league() {
        RestTemplate restTemplate = new RestTemplate();
        League[] lea=restTemplate.getForObject("https://www.football-data.org/v1/competitions/", League[].class);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(lea, responseHeaders, HttpStatus.OK);
    }
    @RequestMapping(value = "/leaguesid", method = RequestMethod.GET)
    public ResponseEntity<Table> getLeague(@RequestParam("ID") Integer id)
    {
        final String uri = "https://www.football-data.org/v1/competitions/"+id+"/leagueTable";
        RestTemplate restTemplate = new RestTemplate();
        Table lea =  restTemplate.getForObject(uri, Table.class);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(lea, responseHeaders, HttpStatus.OK);
    }

    @RequestMapping(value = "/leagues/{id}/teams", method = RequestMethod.GET)
    public ResponseEntity<LeagueTeams> getLeagueteam(@PathVariable("id") String id)
    {
        final String uri = "https://www.football-data.org/v1/competitions/"+id+"/teams";
        RestTemplate restTemplate = new RestTemplate();
        LeagueTeams lea =  restTemplate.getForObject(uri, LeagueTeams.class);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(lea, responseHeaders, HttpStatus.OK);
    }

    @RequestMapping(value = "/teams/{id}/players", method = RequestMethod.GET)
    public ResponseEntity<Team> getTeam(@PathVariable String id)
    {
        final String uri = "https://www.football-data.org/v1/teams/"+id+"/players";
        RestTemplate restTemplate = new RestTemplate();
        Team lea =  restTemplate.getForObject(uri, Team.class);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(lea, responseHeaders, HttpStatus.OK);
    }

    @RequestMapping(value = "/teams/{id}/fixtures", method = RequestMethod.GET)
    public ResponseEntity<Fixtures> getTeamFixtures(@PathVariable String id)
    {
        final String uri = "https://www.football-data.org/v1/teams/"+id+"/fixtures";
        RestTemplate restTemplate = new RestTemplate();
        Fixtures lea =  restTemplate.getForObject(uri, Fixtures.class);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(lea, responseHeaders, HttpStatus.OK);
    }
}