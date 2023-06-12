package com.kratindemo.kratinassignment.service.impl;

import com.kratindemo.kratinassignment.model.Health;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Service
public class HealthServiceImpl implements HealthService{
    Map<String,String> healthTips =new HashMap<>();

    public HealthServiceImpl(){

          }

    public Map<String, String> getHealthTips() {
        healthTips.put("Invest in your sleep","First priority is to invest in your sleep, with Sealy mattresses sleep better, and Sleep naturally. Made with organic cotton, 100% natural latex, hemp fibers, and an ethically sourced wool blend it contributes to Healthier, Cleaner Air. Sealy uses ethically sourced components and environmentally responsible construction techniques – so you can rest easier. Designed for pure comfort.");
        healthTips.put("Homeopathic Treatments","A more holistic approach to improving sleep is using essential oils to calm your system. The most effective way to use essential oils in your home is through a diffuser. Using this air diffuser from Nordstrom.com  in the bedroom for 15 minutes before bedtime will allow you to have a peaceful, restful sleep. The diffuser will disperse essential oils throughout your home creating calmness and relaxation.");
        healthTips.put("Eat Smaller Portions","More than anything, the amount of food we eat is getting out of control. In this super-size-me era, with just a few words, we can receive larger and larger portions. This is a recipe for disaster. Many times it is not what we are eating that is making us gain weight, but the abundance of it. By limiting your portions, you will be cutting back on calories and any extra weight you are carrying around will slowly start coming off.\n");
        healthTips.put("Join a Fitness Class","It is easier to stay in shape when you can do it with friends and other like-minded individuals. All of you have the same goal to become healthier, so a little motivation goes a long way. Therefore, joining a group fitness class is the perfect way to increase your exercise time and have fun doing it. For many of us, if it isn’t enjoyable, then we stop doing it after a bit. Plus, if we are doing it by ourselves, we tend to end our workouts a bit earlier than we should.");
        healthTips.put("Drink Water","It may sound unbelievably simple, but switching out the soda and other sugary beverages you are drinking right now with water can literally save you possibly from diabetes down the road. More people than ever before are being diagnosed with diabetes because they are ingesting a great amount of sugar, and much of it comes from soda. There are people that get their daily allowance of 2,000 calories just from drinking Big Gulps throughout the day. Soda is packed with carbs, calories, and sugar. This is a dangerous trifecta. Water will help you immensely in losing weight and improving your metabolism.");
        healthTips.put("Get Out of the House","There is nothing wrong with being a hermit every now and then. But if you do it too often, it becomes a behavior that is hard to stop. Everyone enjoys being at home by themselves now and then, but don’t go overboard with it. A healthier lifestyle relates to socially, emotionally, and physically improving yourself across the board. Leaving out just one of these segments could be detrimental. Schedule a night out, at least once a week, with friends and family. Go see a movie, find a place to hike, break out your tent and go camping, or go out on the lake. Whatever you choose, just do it with other people.");

        return healthTips;
    }
}
