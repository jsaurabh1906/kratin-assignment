package com.kratindemo.kratinassignment.service.impl;

import com.kratindemo.kratinassignment.model.ExerciseYoga;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ExerciseYogaServiceImpl implements ExerciseYogaService{
    private final List<ExerciseYoga> exerciseList = new ArrayList<>();
    public ExerciseYogaServiceImpl() {
        // Sample data for yoga exercises
        exerciseList.add(new ExerciseYoga("Marjaryasana - Cat and Cow Pose", "Cat and Cow pose is great for anyone at any age, but it’s a great way for women to begin warming up their back and abdominal muscles in a way that is gradual and stable. Supporting your weight on all fours is also a great way to keep arm and chest muscles (that maybe don’t get used as much as we age) strong and conditioned. Women over 50 tend to start experiencing stiffness and reduced mobility in their backs, so cat and cow pose is perfect for helping with those issues as well!", "https://media.graphassets.com/resize=w:930,fit:crop/quality=value:75/output=format:webp/compress/resize=width:509,height:339/CS5afacuQhKjvIxJZz21"));
        exerciseList.add(new ExerciseYoga("Downward Facing Dog", "Otherwise known as “Down Dog,” this yoga pose is great for older women because it:\n" +
                "\n" +
                "Stretches out the calves, hamstrings, and back \n" +
                "\n" +
                "Builds strength in the arms and chest \n" +
                "\n" +
                "Increases flexibility in the shoulders\n" +
                "\n" +
                "Boosts circulation of oxygen and nutrients to otherwise contracting muscles", "https://media.graphassets.com/resize=w:930,fit:crop/quality=value:75/output=format:webp/compress/resize=width:1200,height:801/6Nfj5ONlQySuMZJn9EXu"));
        exerciseList.add(new ExerciseYoga("Baddha Konasana - Modified Cobbler’s Pose", "As women age, it is common for them to encounter knee problems and knee pain, making some yoga poses difficult. However, many yoga poses that increase flexibility and circulation to the hip flexors and hip joints require bent knees. \n" +
                "\n" +
                "Performing cobbler’s pose on a block or bolster where your hips are higher than your knees helps decrease the pressure on your knees while still reaping the gentle benefits of hip stretching. You may also choose to put blocks underneath your knees or move your feet further away from your body so that the angle of bend in your knees isn’t as sharp.", "https://media.graphassets.com/resize=w:930,fit:crop/quality=value:75/output=format:webp/compress/resize=width:1065,height:800/ZAIvrV4MSoaOKXJ1xq6X"));
        exerciseList.add(new ExerciseYoga("Salamba Balanasana - Child’s Pose", "Everyone loves child’s pose! It’s a great stretch for your back, arms, neck, and even hips and glutes. Older women may want to rest their forehead on a block and/or place a blanket underneath their hips to alleviate any discomfort.\n" +
                "\n" +
                "Taking some much needed time in child’s pose allows women to reflect on how their body feels and release any negative thoughts about the changes that may be occurring in their body as they age.\n" +
                "\n" +
                "I would love to have you join us in the Yoga for Senior class, where I not only teach a yoga class specifically catered to women’s needs but talk about common issues women face as they transition into and out of different phases of life! also Check out our latest Wellness class for seniors!\n" +
                "\n", "https://media.graphassets.com/resize=w:930,fit:crop/quality=value:75/output=format:webp/compress/resize=width:1200,height:800/kCERjjRvQ0GeuWtQwS4W"));
        exerciseList.add(new ExerciseYoga("Bhujangasana — Cobra Pose","Aging can be hard on the back, but cobra pose can ease discomfort and improve spinal flexibility to keep you feeling limber and ready to keep moving. Lie flat on your belly with palms planted under shoulders and tops of the feet on the mat. Direct the elbows straight up as you soften the shoulders back to avoid further stress on the back. It may be helpful to bring a block between the hands for added support as you start navigate this shape. Inhale to lift the chest from the floor by pressing through the hands and tapping into the strength in the back body. Continue to draw the shoulders back and the pelvis down as you breathe here.","https://i2.wp.com/fitnessproguru.com/wp-content/uploads/2020/04/Know-about-Bhujangasana-Cobra-Pose-its-benefits-and-precautions.jpg?fit=1024%2C700&ssl=1"));
        exerciseList.add(new ExerciseYoga("Ardha Matsyendrasana — Seated Twist Pose","Twists work wonders on maintaining spinal flexibility and keeping the digestive system working effectively. Find a comfortable seat on either the floor, a block, or a chair with the spine straight. Inhale the arms overhead and exhale as you twist towards the right, bringing your right hand behind and your left hand to your right side. If it’s comfortable on the neck, let the gaze travel over the right shoulder. Avoid forcing yourself deeper into the twist, rather try to initiate the movement from the lower spine and follow up to the neck.","https://www.archanaskitchen.com/images/archanaskitchen/1-Author/nikhilhealthifyme.com/Ardha_Matsyendrasana.jpg"));
    }
    public List<ExerciseYoga> getAllExercises() {
        return exerciseList;
    }

    public ExerciseYoga createExercise(ExerciseYoga exercise) {
        exerciseList.add(exercise);
        return exercise;
    }
}
